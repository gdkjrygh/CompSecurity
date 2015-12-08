.class public Lcom/aetn/history/android/historyhere/utils/TextUtils;
.super Ljava/lang/Object;
.source "TextUtils.java"


# static fields
.field private static final DEFAULT_MONOSPACE_BOLD_FONT_FILENAME:Ljava/lang/String; = "opensans_bold.ttf"

.field private static final DEFAULT_MONOSPACE_BOLD_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_italic.ttf"

.field private static final DEFAULT_MONOSPACE_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_italic.ttf"

.field private static final DEFAULT_MONOSPACE_NORMAL_FONT_FILENAME:Ljava/lang/String; = "opensans_regular.ttf"

.field private static final DEFAULT_NORMAL_BOLD_FONT_FILENAME:Ljava/lang/String; = "opensans_bold.ttf"

.field private static final DEFAULT_NORMAL_BOLD_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_bold.ttf"

.field private static final DEFAULT_NORMAL_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_italic.ttf"

.field private static final DEFAULT_NORMAL_NORMAL_FONT_FILENAME:Ljava/lang/String; = "opensans_regular.ttf"

.field private static final DEFAULT_SANS_BOLD_FONT_FILENAME:Ljava/lang/String; = "opensans_bold.ttf"

.field private static final DEFAULT_SANS_BOLD_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_italic.ttf"

.field private static final DEFAULT_SANS_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_italic.ttf"

.field private static final DEFAULT_SANS_NORMAL_FONT_FILENAME:Ljava/lang/String; = "opensans_regular.ttf"

.field private static final DEFAULT_SERIF_BOLD_FONT_FILENAME:Ljava/lang/String; = "opensans_bold.ttf"

.field private static final DEFAULT_SERIF_BOLD_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_italic.ttf"

.field private static final DEFAULT_SERIF_ITALIC_FONT_FILENAME:Ljava/lang/String; = "opensans_italic.ttf"

.field private static final DEFAULT_SERIF_NORMAL_FONT_FILENAME:Ljava/lang/String; = "opensans_regular.ttf"

.field private static final monospace_idx:I = 0x3

.field private static final normal_idx:I = 0x0

.field private static final sans_idx:I = 0x1

.field private static final serif_idx:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static initFonts(Landroid/content/Context;)V
    .locals 2
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 45
    :try_start_0
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setDefaultFonts(Landroid/content/Context;)V

    .line 48
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 49
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setDefaultFontForTypeFaceSans(Landroid/content/Context;)V

    .line 50
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setDefaultFontForTypeFaceSansSerif(Landroid/content/Context;)V

    .line 51
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setDefaultFontForTypeFaceMonospace(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :cond_0
    :goto_0
    return-void

    .line 59
    :catch_0
    move-exception v0

    goto :goto_0

    .line 56
    :catch_1
    move-exception v0

    goto :goto_0

    .line 53
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method private static setDefaultFontForTypeFaceMonospace(Landroid/content/Context;)V
    .locals 6
    .param p0, "c"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 145
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_bold.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 146
    .local v0, "bold":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_italic.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    .line 147
    .local v2, "italic":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_italic.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 148
    .local v1, "boldItalic":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_regular.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 150
    .local v3, "normal":Landroid/graphics/Typeface;
    const/4 v4, 0x3

    invoke-static {v3, v0, v2, v1, v4}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypeFaceDefaults(Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;I)V

    .line 151
    return-void
.end method

.method private static setDefaultFontForTypeFaceSans(Landroid/content/Context;)V
    .locals 6
    .param p0, "c"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 127
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_bold.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 128
    .local v0, "bold":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_italic.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    .line 129
    .local v2, "italic":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_italic.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 130
    .local v1, "boldItalic":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_regular.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 132
    .local v3, "normal":Landroid/graphics/Typeface;
    const/4 v4, 0x1

    invoke-static {v3, v0, v2, v1, v4}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypeFaceDefaults(Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;I)V

    .line 133
    return-void
.end method

.method private static setDefaultFontForTypeFaceSansSerif(Landroid/content/Context;)V
    .locals 6
    .param p0, "c"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 136
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_bold.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 137
    .local v0, "bold":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_italic.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    .line 138
    .local v2, "italic":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_italic.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 139
    .local v1, "boldItalic":Landroid/graphics/Typeface;
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "opensans_regular.ttf"

    invoke-static {v4, v5}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 141
    .local v3, "normal":Landroid/graphics/Typeface;
    const/4 v4, 0x2

    invoke-static {v3, v0, v2, v1, v4}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypeFaceDefaults(Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;I)V

    .line 142
    return-void
.end method

.method private static setDefaultFonts(Landroid/content/Context;)V
    .locals 16
    .param p0, "c"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 93
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v14, "opensans_bold.ttf"

    invoke-static {v13, v14}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 94
    .local v0, "bold":Landroid/graphics/Typeface;
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v14, "opensans_italic.ttf"

    invoke-static {v13, v14}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v4

    .line 95
    .local v4, "italic":Landroid/graphics/Typeface;
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v14, "opensans_bold.ttf"

    invoke-static {v13, v14}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 96
    .local v1, "boldItalic":Landroid/graphics/Typeface;
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v14, "opensans_regular.ttf"

    invoke-static {v13, v14}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v6

    .line 98
    .local v6, "normal":Landroid/graphics/Typeface;
    const-class v13, Landroid/graphics/Typeface;

    const-string v14, "DEFAULT"

    invoke-virtual {v13, v14}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 99
    .local v3, "defaultField":Ljava/lang/reflect/Field;
    const/4 v13, 0x1

    invoke-virtual {v3, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 100
    const/4 v13, 0x0

    invoke-virtual {v3, v13, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    const-class v13, Landroid/graphics/Typeface;

    const-string v14, "DEFAULT_BOLD"

    invoke-virtual {v13, v14}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 103
    .local v2, "defaultBoldField":Ljava/lang/reflect/Field;
    const/4 v13, 0x1

    invoke-virtual {v2, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 104
    const/4 v13, 0x0

    invoke-virtual {v2, v13, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    const-class v13, Landroid/graphics/Typeface;

    const-string v14, "sDefaults"

    invoke-virtual {v13, v14}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v10

    .line 107
    .local v10, "sDefaults":Ljava/lang/reflect/Field;
    const/4 v13, 0x1

    invoke-virtual {v10, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 108
    const/4 v13, 0x0

    const/4 v14, 0x4

    new-array v14, v14, [Landroid/graphics/Typeface;

    const/4 v15, 0x0

    aput-object v6, v14, v15

    const/4 v15, 0x1

    aput-object v0, v14, v15

    const/4 v15, 0x2

    aput-object v4, v14, v15

    const/4 v15, 0x3

    aput-object v1, v14, v15

    invoke-virtual {v10, v13, v14}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v14, "opensans_regular.ttf"

    invoke-static {v13, v14}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v8

    .line 111
    .local v8, "normal_sans":Landroid/graphics/Typeface;
    const-class v13, Landroid/graphics/Typeface;

    const-string v14, "SANS_SERIF"

    invoke-virtual {v13, v14}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v11

    .line 112
    .local v11, "sansSerifDefaultField":Ljava/lang/reflect/Field;
    const/4 v13, 0x1

    invoke-virtual {v11, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 113
    const/4 v13, 0x0

    invoke-virtual {v11, v13, v8}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v14, "opensans_regular.ttf"

    invoke-static {v13, v14}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v9

    .line 116
    .local v9, "normal_serif":Landroid/graphics/Typeface;
    const-class v13, Landroid/graphics/Typeface;

    const-string v14, "SERIF"

    invoke-virtual {v13, v14}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    .line 117
    .local v12, "serifDefaultField":Ljava/lang/reflect/Field;
    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 118
    const/4 v13, 0x0

    invoke-virtual {v12, v13, v9}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v13

    const-string v14, "opensans_regular.ttf"

    invoke-static {v13, v14}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v7

    .line 121
    .local v7, "normal_monospace":Landroid/graphics/Typeface;
    const-class v13, Landroid/graphics/Typeface;

    const-string v14, "MONOSPACE"

    invoke-virtual {v13, v14}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 122
    .local v5, "monospaceDefaultField":Ljava/lang/reflect/Field;
    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 123
    const/4 v13, 0x0

    invoke-virtual {v5, v13, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    return-void
.end method

.method private static setTypeFaceDefaults(Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;I)V
    .locals 7
    .param p0, "normal"    # Landroid/graphics/Typeface;
    .param p1, "bold"    # Landroid/graphics/Typeface;
    .param p2, "italic"    # Landroid/graphics/Typeface;
    .param p3, "boldItalic"    # Landroid/graphics/Typeface;
    .param p4, "typefaceIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x1

    .line 154
    const-class v3, Landroid/graphics/Typeface;

    const-string v4, "sTypefaceCache"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 155
    .local v2, "typeFacesField":Ljava/lang/reflect/Field;
    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 157
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1, v6}, Landroid/util/SparseArray;-><init>(I)V

    .line 158
    .local v1, "sTypefaceCacheLocal":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/util/SparseArray<Landroid/graphics/Typeface;>;>;"
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    new-instance v0, Landroid/util/SparseArray;

    const/4 v3, 0x4

    invoke-direct {v0, v3}, Landroid/util/SparseArray;-><init>(I)V

    .line 161
    .local v0, "newValues":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/graphics/Typeface;>;"
    const/4 v3, 0x0

    invoke-virtual {v0, v3, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 162
    invoke-virtual {v0, v5, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 163
    const/4 v3, 0x2

    invoke-virtual {v0, v3, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 164
    invoke-virtual {v0, v6, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 165
    invoke-virtual {v1, p4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 167
    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    return-void
.end method

.method public static setTypefaceBold(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 73
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "opensans_bold.ttf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 74
    .local v0, "tf":Landroid/graphics/Typeface;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 75
    return-object p1
.end method

.method public static setTypefaceLight(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "opensans_light.ttf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 68
    .local v0, "tf":Landroid/graphics/Typeface;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 69
    return-object p1
.end method

.method public static setTypefaceRegular(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 85
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "opensans_regular.ttf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 86
    .local v0, "tf":Landroid/graphics/Typeface;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 87
    return-object p1
.end method

.method public static setTypefaceSemibold(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 79
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "opensans_semibold.ttf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 80
    .local v0, "tf":Landroid/graphics/Typeface;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 81
    return-object p1
.end method
