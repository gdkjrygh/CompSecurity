.class Lorg/chromium/base/ResourceExtractor$ExtractTask;
.super Landroid/os/AsyncTask;
.source "ResourceExtractor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/ResourceExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExtractTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static final BUFFER_SIZE:I = 0x4000


# instance fields
.field final synthetic this$0:Lorg/chromium/base/ResourceExtractor;


# direct methods
.method public constructor <init>(Lorg/chromium/base/ResourceExtractor;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 58
    return-void
.end method

.method private checkPakTimestamp(Ljava/io/File;)Ljava/lang/String;
    .locals 11
    .param p1, "outputDir"    # Ljava/io/File;

    .prologue
    const/4 v10, 0x0

    .line 217
    const-string v4, "pak_timestamp-"

    .line 218
    .local v4, "timestampPrefix":Ljava/lang/String;
    iget-object v6, p0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    # getter for: Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;
    invoke-static {v6}, Lorg/chromium/base/ResourceExtractor;->access$200(Lorg/chromium/base/ResourceExtractor;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 219
    .local v3, "pm":Landroid/content/pm/PackageManager;
    const/4 v2, 0x0

    .line 222
    .local v2, "pi":Landroid/content/pm/PackageInfo;
    :try_start_0
    iget-object v6, p0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    # getter for: Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;
    invoke-static {v6}, Lorg/chromium/base/ResourceExtractor;->access$200(Lorg/chromium/base/ResourceExtractor;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v3, v6, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 227
    if-nez v2, :cond_1

    .line 228
    const-string v1, "pak_timestamp-"

    .line 251
    :cond_0
    :goto_0
    return-object v1

    .line 223
    :catch_0
    move-exception v0

    .line 224
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v1, "pak_timestamp-"

    goto :goto_0

    .line 231
    .end local v0    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "pak_timestamp-"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "-"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-wide v8, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 233
    .local v1, "expectedTimestamp":Ljava/lang/String;
    new-instance v6, Lorg/chromium/base/ResourceExtractor$ExtractTask$1;

    invoke-direct {v6, p0}, Lorg/chromium/base/ResourceExtractor$ExtractTask$1;-><init>(Lorg/chromium/base/ResourceExtractor$ExtractTask;)V

    invoke-virtual {p1, v6}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v5

    .line 240
    .local v5, "timestamps":[Ljava/lang/String;
    array-length v6, v5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    .line 246
    aget-object v6, v5, v10

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 251
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 54
    check-cast p1, [Ljava/lang/Void;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/chromium/base/ResourceExtractor$ExtractTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 34
    .param p1, "unused"    # [Ljava/lang/Void;

    .prologue
    .line 62
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    move-object/from16 v29, v0

    # invokes: Lorg/chromium/base/ResourceExtractor;->getOutputDir()Ljava/io/File;
    invoke-static/range {v29 .. v29}, Lorg/chromium/base/ResourceExtractor;->access$000(Lorg/chromium/base/ResourceExtractor;)Ljava/io/File;

    move-result-object v24

    .line 63
    .local v24, "outputDir":Ljava/io/File;
    invoke-virtual/range {v24 .. v24}, Ljava/io/File;->exists()Z

    move-result v29

    if-nez v29, :cond_0

    invoke-virtual/range {v24 .. v24}, Ljava/io/File;->mkdirs()Z

    move-result v29

    if-nez v29, :cond_0

    .line 64
    const-string v29, "ResourceExtractor"

    const-string v30, "Unable to create pak resources directory!"

    invoke-static/range {v29 .. v30}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    const/16 v29, 0x0

    .line 206
    :goto_0
    return-object v29

    .line 68
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    invoke-direct {v0, v1}, Lorg/chromium/base/ResourceExtractor$ExtractTask;->checkPakTimestamp(Ljava/io/File;)Ljava/lang/String;

    move-result-object v28

    .line 69
    .local v28, "timestampFile":Ljava/lang/String;
    if-eqz v28, :cond_1

    .line 70
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    move-object/from16 v29, v0

    # invokes: Lorg/chromium/base/ResourceExtractor;->deleteFiles()V
    invoke-static/range {v29 .. v29}, Lorg/chromium/base/ResourceExtractor;->access$100(Lorg/chromium/base/ResourceExtractor;)V

    .line 73
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    move-object/from16 v29, v0

    # getter for: Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;
    invoke-static/range {v29 .. v29}, Lorg/chromium/base/ResourceExtractor;->access$200(Lorg/chromium/base/ResourceExtractor;)Landroid/content/Context;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v29

    invoke-static/range {v29 .. v29}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v27

    .line 75
    .local v27, "prefs":Landroid/content/SharedPreferences;
    const-string v29, "Pak filenames"

    new-instance v30, Ljava/util/HashSet;

    invoke-direct/range {v30 .. v30}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v0, v27

    move-object/from16 v1, v29

    move-object/from16 v2, v30

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v11

    check-cast v11, Ljava/util/HashSet;

    .line 77
    .local v11, "filenames":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    invoke-static {}, Lorg/chromium/base/LocaleUtils;->getDefaultLocale()Ljava/lang/String;

    move-result-object v8

    .line 78
    .local v8, "currentLocale":Ljava/lang/String;
    const-string v29, "-"

    const/16 v30, 0x2

    move-object/from16 v0, v29

    move/from16 v1, v30

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v29

    const/16 v30, 0x0

    aget-object v7, v29, v30

    .line 80
    .local v7, "currentLanguage":Ljava/lang/String;
    const-string v29, "Last language"

    const-string v30, ""

    move-object/from16 v0, v27

    move-object/from16 v1, v29

    move-object/from16 v2, v30

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    move-object/from16 v0, v29

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_4

    invoke-virtual {v11}, Ljava/util/HashSet;->size()I

    move-result v29

    # getter for: Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->access$300()[Ljava/lang/String;

    move-result-object v30

    move-object/from16 v0, v30

    array-length v0, v0

    move/from16 v30, v0

    move/from16 v0, v29

    move/from16 v1, v30

    if-lt v0, v1, :cond_4

    .line 82
    const/4 v14, 0x1

    .line 83
    .local v14, "filesPresent":Z
    invoke-virtual {v11}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v15

    .local v15, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    if-eqz v29, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 84
    .local v10, "file":Ljava/lang/String;
    new-instance v29, Ljava/io/File;

    move-object/from16 v0, v29

    move-object/from16 v1, v24

    invoke-direct {v0, v1, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual/range {v29 .. v29}, Ljava/io/File;->exists()Z

    move-result v29

    if-nez v29, :cond_2

    .line 85
    const/4 v14, 0x0

    .line 89
    .end local v10    # "file":Ljava/lang/String;
    :cond_3
    if-eqz v14, :cond_5

    const/16 v29, 0x0

    goto/16 :goto_0

    .line 91
    .end local v14    # "filesPresent":Z
    .end local v15    # "i$":Ljava/util/Iterator;
    :cond_4
    invoke-interface/range {v27 .. v27}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v29

    const-string v30, "Last language"

    move-object/from16 v0, v29

    move-object/from16 v1, v30

    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v29

    invoke-interface/range {v29 .. v29}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 94
    :cond_5
    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .local v25, "p":Ljava/lang/StringBuilder;
    # getter for: Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->access$300()[Ljava/lang/String;

    move-result-object v4

    .local v4, "arr$":[Ljava/lang/String;
    array-length v0, v4

    move/from16 v18, v0

    .local v18, "len$":I
    const/4 v15, 0x0

    .local v15, "i$":I
    :goto_1
    move/from16 v0, v18

    if-ge v15, v0, :cond_7

    aget-object v20, v4, v15

    .line 96
    .local v20, "mandatoryPak":Ljava/lang/String;
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->length()I

    move-result v29

    if-lez v29, :cond_6

    const/16 v29, 0x7c

    move-object/from16 v0, v25

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    :cond_6
    new-instance v29, Ljava/lang/StringBuilder;

    invoke-direct/range {v29 .. v29}, Ljava/lang/StringBuilder;-><init>()V

    const-string v30, "\\Q"

    invoke-virtual/range {v29 .. v30}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v29

    move-object/from16 v0, v29

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v29

    const-string v30, "\\E"

    invoke-virtual/range {v29 .. v30}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    move-object/from16 v0, v25

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 100
    .end local v20    # "mandatoryPak":Ljava/lang/String;
    :cond_7
    # getter for: Lorg/chromium/base/ResourceExtractor;->sExtractImplicitLocalePak:Z
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->access$400()Z

    move-result v29

    if-eqz v29, :cond_9

    .line 101
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->length()I

    move-result v29

    if-lez v29, :cond_8

    const/16 v29, 0x7c

    move-object/from16 v0, v25

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    :cond_8
    move-object/from16 v0, v25

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    const-string v29, "(-\\w+)?\\.pak"

    move-object/from16 v0, v25

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    :cond_9
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    invoke-static/range {v29 .. v29}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v26

    .line 111
    .local v26, "paksToInstall":Ljava/util/regex/Pattern;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    move-object/from16 v29, v0

    # getter for: Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;
    invoke-static/range {v29 .. v29}, Lorg/chromium/base/ResourceExtractor;->access$200(Lorg/chromium/base/ResourceExtractor;)Landroid/content/Context;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v19

    .line 116
    .local v19, "manager":Landroid/content/res/AssetManager;
    const/4 v5, 0x0

    .line 117
    .local v5, "buffer":[B
    :try_start_0
    const-string v29, ""

    move-object/from16 v0, v19

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 118
    .local v12, "files":[Ljava/lang/String;
    # getter for: Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->access$500()Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    move-result-object v29

    if-eqz v29, :cond_b

    .line 119
    # getter for: Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->access$500()Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    move-result-object v29

    invoke-interface/range {v29 .. v29}, Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;->getInterceptableResourceList()Ljava/util/Set;

    move-result-object v13

    .line 121
    .local v13, "filesIncludingInterceptableFiles":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-eqz v13, :cond_b

    invoke-interface {v13}, Ljava/util/Set;->isEmpty()Z

    move-result v29

    if-nez v29, :cond_b

    .line 123
    move-object v4, v12

    array-length v0, v4

    move/from16 v18, v0

    const/4 v15, 0x0

    :goto_2
    move/from16 v0, v18

    if-ge v15, v0, :cond_a

    aget-object v10, v4, v15

    .line 124
    .restart local v10    # "file":Ljava/lang/String;
    invoke-interface {v13, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 123
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 126
    .end local v10    # "file":Ljava/lang/String;
    :cond_a
    invoke-interface {v13}, Ljava/util/Set;->size()I

    move-result v29

    move/from16 v0, v29

    new-array v12, v0, [Ljava/lang/String;

    .line 127
    invoke-interface {v13, v12}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 130
    .end local v13    # "filesIncludingInterceptableFiles":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_b
    move-object v4, v12

    array-length v0, v4

    move/from16 v18, v0

    const/4 v15, 0x0

    :goto_3
    move/from16 v0, v18

    if-ge v15, v0, :cond_1a

    aget-object v10, v4, v15

    .line 131
    .restart local v10    # "file":Ljava/lang/String;
    move-object/from16 v0, v26

    invoke-virtual {v0, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Ljava/util/regex/Matcher;->matches()Z

    move-result v29

    if-nez v29, :cond_d

    .line 130
    :cond_c
    :goto_4
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    .line 134
    :cond_d
    const-string v29, "icudtl.dat"

    move-object/from16 v0, v29

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    .line 135
    .local v17, "isICUData":Z
    new-instance v23, Ljava/io/File;

    if-eqz v17, :cond_13

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    move-object/from16 v29, v0

    # invokes: Lorg/chromium/base/ResourceExtractor;->getAppDataDir()Ljava/io/File;
    invoke-static/range {v29 .. v29}, Lorg/chromium/base/ResourceExtractor;->access$600(Lorg/chromium/base/ResourceExtractor;)Ljava/io/File;

    move-result-object v29

    :goto_5
    move-object/from16 v0, v23

    move-object/from16 v1, v29

    invoke-direct {v0, v1, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 136
    .local v23, "output":Ljava/io/File;
    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->exists()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v29

    if-nez v29, :cond_c

    .line 140
    const/16 v16, 0x0

    .line 141
    .local v16, "is":Ljava/io/InputStream;
    const/16 v21, 0x0

    .line 143
    .local v21, "os":Ljava/io/OutputStream;
    :try_start_1
    # getter for: Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->access$500()Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    move-result-object v29

    if-eqz v29, :cond_e

    .line 144
    # getter for: Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->access$500()Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    move-result-object v29

    move-object/from16 v0, v29

    invoke-interface {v0, v10}, Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;->interceptLoadingForResource(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v16

    .line 146
    :cond_e
    if-nez v16, :cond_f

    move-object/from16 v0, v19

    invoke-virtual {v0, v10}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v16

    .line 147
    :cond_f
    new-instance v22, Ljava/io/FileOutputStream;

    invoke-direct/range {v22 .. v23}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 148
    .end local v21    # "os":Ljava/io/OutputStream;
    .local v22, "os":Ljava/io/OutputStream;
    :try_start_2
    const-string v29, "ResourceExtractor"

    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "Extracting resource "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v29 .. v30}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    if-nez v5, :cond_10

    .line 150
    const/16 v29, 0x4000

    move/from16 v0, v29

    new-array v5, v0, [B

    .line 153
    :cond_10
    const/4 v6, 0x0

    .line 154
    .local v6, "count":I
    :goto_6
    const/16 v29, 0x0

    const/16 v30, 0x4000

    move-object/from16 v0, v16

    move/from16 v1, v29

    move/from16 v2, v30

    invoke-virtual {v0, v5, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    const/16 v29, -0x1

    move/from16 v0, v29

    if-eq v6, v0, :cond_14

    .line 155
    const/16 v29, 0x0

    move-object/from16 v0, v22

    move/from16 v1, v29

    invoke-virtual {v0, v5, v1, v6}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    .line 171
    .end local v6    # "count":I
    :catchall_0
    move-exception v29

    move-object/from16 v21, v22

    .line 172
    .end local v22    # "os":Ljava/io/OutputStream;
    .restart local v21    # "os":Ljava/io/OutputStream;
    :goto_7
    if-eqz v16, :cond_11

    .line 173
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 176
    :cond_11
    if-eqz v21, :cond_12

    .line 177
    :try_start_4
    invoke-virtual/range {v21 .. v21}, Ljava/io/OutputStream;->close()V

    :cond_12
    throw v29
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 182
    .end local v10    # "file":Ljava/lang/String;
    .end local v12    # "files":[Ljava/lang/String;
    .end local v16    # "is":Ljava/io/InputStream;
    .end local v17    # "isICUData":Z
    .end local v21    # "os":Ljava/io/OutputStream;
    .end local v23    # "output":Ljava/io/File;
    :catch_0
    move-exception v9

    .line 187
    .local v9, "e":Ljava/io/IOException;
    const-string v29, "ResourceExtractor"

    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "Exception unpacking required pak resources: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v29 .. v30}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor$ExtractTask;->this$0:Lorg/chromium/base/ResourceExtractor;

    move-object/from16 v29, v0

    # invokes: Lorg/chromium/base/ResourceExtractor;->deleteFiles()V
    invoke-static/range {v29 .. v29}, Lorg/chromium/base/ResourceExtractor;->access$100(Lorg/chromium/base/ResourceExtractor;)V

    .line 189
    const/16 v29, 0x0

    goto/16 :goto_0

    .end local v9    # "e":Ljava/io/IOException;
    .restart local v10    # "file":Ljava/lang/String;
    .restart local v12    # "files":[Ljava/lang/String;
    .restart local v17    # "isICUData":Z
    :cond_13
    move-object/from16 v29, v24

    .line 135
    goto/16 :goto_5

    .line 157
    .restart local v6    # "count":I
    .restart local v16    # "is":Ljava/io/InputStream;
    .restart local v22    # "os":Ljava/io/OutputStream;
    .restart local v23    # "output":Ljava/io/File;
    :cond_14
    :try_start_5
    invoke-virtual/range {v22 .. v22}, Ljava/io/OutputStream;->flush()V

    .line 160
    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->length()J

    move-result-wide v30

    const-wide/16 v32, 0x0

    cmp-long v29, v30, v32

    if-nez v29, :cond_15

    .line 161
    new-instance v29, Ljava/io/IOException;

    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v30

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, " extracted with 0 length!"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-direct/range {v29 .. v30}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v29

    .line 164
    :cond_15
    if-nez v17, :cond_17

    .line 165
    invoke-virtual {v11, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 172
    :goto_8
    if-eqz v16, :cond_16

    .line 173
    :try_start_6
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 176
    :cond_16
    if-eqz v22, :cond_c

    .line 177
    :try_start_7
    invoke-virtual/range {v22 .. v22}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    goto/16 :goto_4

    .line 168
    :cond_17
    const/16 v29, 0x1

    const/16 v30, 0x0

    :try_start_8
    move-object/from16 v0, v23

    move/from16 v1, v29

    move/from16 v2, v30

    invoke-virtual {v0, v1, v2}, Ljava/io/File;->setReadable(ZZ)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_8

    .line 176
    :catchall_1
    move-exception v29

    if-eqz v22, :cond_18

    .line 177
    :try_start_9
    invoke-virtual/range {v22 .. v22}, Ljava/io/OutputStream;->close()V

    :cond_18
    throw v29

    .line 176
    .end local v6    # "count":I
    .end local v22    # "os":Ljava/io/OutputStream;
    .restart local v21    # "os":Ljava/io/OutputStream;
    :catchall_2
    move-exception v29

    if-eqz v21, :cond_19

    .line 177
    invoke-virtual/range {v21 .. v21}, Ljava/io/OutputStream;->close()V

    :cond_19
    throw v29
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    .line 194
    .end local v10    # "file":Ljava/lang/String;
    .end local v16    # "is":Ljava/io/InputStream;
    .end local v17    # "isICUData":Z
    .end local v21    # "os":Ljava/io/OutputStream;
    .end local v23    # "output":Ljava/io/File;
    :cond_1a
    if-eqz v28, :cond_1b

    .line 196
    :try_start_a
    new-instance v29, Ljava/io/File;

    move-object/from16 v0, v29

    move-object/from16 v1, v24

    move-object/from16 v2, v28

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual/range {v29 .. v29}, Ljava/io/File;->createNewFile()Z
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1

    .line 204
    :cond_1b
    :goto_9
    invoke-interface/range {v27 .. v27}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v29

    const-string v30, "Pak filenames"

    invoke-interface/range {v29 .. v30}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v29

    invoke-interface/range {v29 .. v29}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 205
    invoke-interface/range {v27 .. v27}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v29

    const-string v30, "Pak filenames"

    move-object/from16 v0, v29

    move-object/from16 v1, v30

    invoke-interface {v0, v1, v11}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    move-result-object v29

    invoke-interface/range {v29 .. v29}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 206
    const/16 v29, 0x0

    goto/16 :goto_0

    .line 197
    :catch_1
    move-exception v9

    .line 200
    .restart local v9    # "e":Ljava/io/IOException;
    const-string v29, "ResourceExtractor"

    const-string v30, "Failed to write resource pak timestamp!"

    invoke-static/range {v29 .. v30}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    .line 171
    .end local v9    # "e":Ljava/io/IOException;
    .restart local v10    # "file":Ljava/lang/String;
    .restart local v16    # "is":Ljava/io/InputStream;
    .restart local v17    # "isICUData":Z
    .restart local v21    # "os":Ljava/io/OutputStream;
    .restart local v23    # "output":Ljava/io/File;
    :catchall_3
    move-exception v29

    goto/16 :goto_7
.end method
