.class public final Lcom/roidapp/photogrid/cloud/bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/cloud/o;


# instance fields
.field private a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Save/Finish/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/common/af;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/bf;)Lcom/roidapp/photogrid/cloud/p;
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/bf;->h()Lcom/roidapp/photogrid/cloud/p;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z
    .locals 12

    .prologue
    .line 37
    const/4 v10, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move/from16 v11, p10

    invoke-static/range {v0 .. v11}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/bf;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    return-object v0
.end method

.method private h()Lcom/roidapp/photogrid/cloud/p;
    .locals 13

    .prologue
    .line 193
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v1, "share"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    .line 195
    const/4 v0, 0x0

    .line 196
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v1, :cond_2

    .line 197
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 199
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 200
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 202
    const-string v0, "video/mp4"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    const/4 v0, 0x0

    .line 205
    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 209
    :goto_0
    if-eqz v0, :cond_1

    .line 210
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 211
    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v3, :cond_0

    .line 212
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 213
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 214
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 220
    :cond_2
    new-instance v12, Ljava/util/TreeSet;

    invoke-direct {v12}, Ljava/util/TreeSet;-><init>()V

    .line 222
    const-wide/16 v2, 0x64

    .line 223
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v4, "com.whatsapp"

    invoke-static {v1, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 224
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v2, "Whatsapp"

    const-wide/16 v4, 0x64

    const-wide/16 v8, 0x63

    invoke-interface {v7, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f020196

    const/4 v5, -0x7

    const-string v6, "Whatsapp"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    .line 226
    const-string v2, "com.whatsapp"

    iput-object v2, v1, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    .line 227
    invoke-virtual {v12, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v8

    .line 229
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v4, "com.google.android.apps.plus"

    invoke-static {v1, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 230
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v4, "Google+"

    const-wide/16 v8, 0x1

    sub-long v8, v2, v8

    invoke-interface {v7, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f020162

    const/4 v5, -0x2

    const-string v6, "Google+"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v12, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v8

    .line 231
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-nez v1, :cond_5

    .line 232
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v4, "Pinterest"

    const-wide/16 v8, 0x1

    sub-long v8, v2, v8

    invoke-interface {v7, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f020173

    const/4 v5, -0x6

    const-string v6, "Pinterest"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v12, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v8

    .line 233
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v4, 0x7f070140

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 234
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-wide/16 v4, 0x1

    sub-long v10, v2, v4

    invoke-interface {v7, v6, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f02016d

    const/4 v5, -0x3

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v12, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 236
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v2, "com.facebook.orca"

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 237
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v2, "Messenger"

    const-wide/16 v4, 0x1

    sub-long v8, v10, v4

    invoke-interface {v7, v2, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f02015b

    const/4 v5, -0x8

    const-string v6, "Messenger"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v12, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v8

    .line 239
    :goto_2
    const/4 v1, 0x0

    :goto_3
    sget-object v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    array-length v4, v4

    if-ge v1, v4, :cond_8

    .line 240
    if-nez v0, :cond_7

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    sget-object v5, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v5, v5, v1

    iget-object v5, v5, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    invoke-static {v4, v5}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 241
    :goto_4
    new-instance v6, Lcom/roidapp/photogrid/cloud/p;

    sget-object v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v8, v4, v1

    sget-object v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v4, v4, v1

    iget-object v9, v4, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    const-wide/16 v4, 0x1

    sub-long v4, v2, v4

    invoke-interface {v7, v9, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-direct {v6, v8, v2, v3, v1}, Lcom/roidapp/photogrid/cloud/p;-><init>(Lcom/roidapp/photogrid/cloud/p;JI)V

    invoke-virtual {v12, v6}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v4

    .line 239
    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 240
    :cond_7
    sget-object v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v4, v4, v1

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_4

    .line 245
    :cond_8
    invoke-virtual {v12}, Ljava/util/TreeSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    :goto_5
    return-object v0

    :cond_9
    invoke-virtual {v12}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/p;

    goto :goto_5

    :catch_0
    move-exception v2

    goto/16 :goto_0

    :cond_a
    move-wide v2, v10

    goto :goto_2
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 58
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 59
    const v1, 0x7f03001e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1185
    if-eqz v1, :cond_0

    .line 1186
    const v0, 0x7f0d00a3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1187
    if-eqz v0, :cond_0

    .line 1188
    const v2, 0x7f0702b6

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 61
    :cond_0
    return-object v1
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 250
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 54
    return-void
.end method

.method public final a(IILandroid/content/Intent;)V
    .locals 0

    .prologue
    .line 50
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 182
    return-void
.end method

.method public final b()[Lcom/roidapp/photogrid/cloud/a/l;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v0, :cond_0

    .line 67
    new-array v0, v5, [Lcom/roidapp/photogrid/cloud/a/l;

    new-instance v1, Lcom/roidapp/photogrid/cloud/bg;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {v1, p0, v2, v3}, Lcom/roidapp/photogrid/cloud/bg;-><init>(Lcom/roidapp/photogrid/cloud/bf;Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    aput-object v1, v0, v4

    .line 69
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/roidapp/photogrid/cloud/a/l;

    new-instance v1, Lcom/roidapp/photogrid/cloud/bh;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {v1, p0, v2, v3}, Lcom/roidapp/photogrid/cloud/bh;-><init>(Lcom/roidapp/photogrid/cloud/bf;Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    aput-object v1, v0, v4

    new-instance v1, Lcom/roidapp/photogrid/cloud/bg;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {v1, p0, v2, v3}, Lcom/roidapp/photogrid/cloud/bg;-><init>(Lcom/roidapp/photogrid/cloud/bf;Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    aput-object v1, v0, v5

    goto :goto_0
.end method

.method public final c()I
    .locals 4

    .prologue
    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k:I

    if-nez v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 165
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bf;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090139

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x41800000    # 16.0f

    mul-float/2addr v0, v3

    sub-float v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k:I

    .line 167
    :cond_0
    const v0, 0x7f0d00a1

    return v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 172
    const v0, 0x7f070227

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 177
    const-string v0, "#PhotoGrid"

    return-object v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 255
    const/4 v0, 0x0

    return v0
.end method

.method public final g()V
    .locals 0

    .prologue
    .line 261
    return-void
.end method
