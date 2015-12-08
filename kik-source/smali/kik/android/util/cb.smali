.class public final Lkik/android/util/cb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/cb$1;,
        Lkik/android/util/cb$a;
    }
.end annotation


# static fields
.field private static a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lkik/android/util/cb;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static a(Landroid/widget/TextView;II)V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 81
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    :cond_0
    :goto_0
    return-void

    .line 85
    :cond_1
    sget-object v0, Lkik/android/util/cb$1;->a:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    if-ne p2, v4, :cond_a

    const-string v0, "fonts/Roboto-BoldItalic.ttf"

    move-object v1, v0

    .line 86
    :goto_1
    sget-object v0, Lkik/android/util/cb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    .line 87
    if-nez v0, :cond_2

    .line 88
    invoke-virtual {p0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 89
    sget-object v2, Lkik/android/util/cb;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    :cond_2
    if-eqz v0, :cond_0

    .line 92
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 85
    :pswitch_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_3

    const-string v0, "fonts/Roboto-BlackItalic.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_3
    const-string v0, "fonts/Roboto-Black.ttf"

    move-object v1, v0

    goto :goto_1

    :pswitch_1
    if-ne v4, p2, :cond_4

    const-string v0, "fonts/Roboto-BoldCondensedItalic.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_4
    if-ne v2, p2, :cond_5

    const-string v0, "fonts/Roboto-BoldCondensed.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_5
    if-ne v3, p2, :cond_6

    const-string v0, "fonts/Roboto-CondensedItalic.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_6
    const-string v0, "fonts/Roboto-Condensed.ttf"

    move-object v1, v0

    goto :goto_1

    :pswitch_2
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_7

    const-string v0, "fonts/Roboto-LightItalic.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_7
    const-string v0, "fonts/Roboto-Light.ttf"

    move-object v1, v0

    goto :goto_1

    :pswitch_3
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_8

    const-string v0, "fonts/Roboto-MediumItalic.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_8
    const-string v0, "fonts/Roboto-Medium.ttf"

    move-object v1, v0

    goto :goto_1

    :pswitch_4
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_9

    const-string v0, "fonts/Roboto-ThinItalic.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_9
    const-string v0, "fonts/Roboto-Thin.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_a
    if-ne p2, v2, :cond_b

    const-string v0, "fonts/Roboto-Bold.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_b
    if-ne p2, v3, :cond_c

    const-string v0, "fonts/Roboto-Italic.ttf"

    move-object v1, v0

    goto :goto_1

    :cond_c
    const-string v0, "fonts/Roboto-Regular.ttf"

    move-object v1, v0

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
