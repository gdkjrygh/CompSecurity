.class public Lcom/cleanmaster/util/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;


# instance fields
.field d:Ljava/lang/String;

.field e:I

.field f:I

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:I

.field k:Ljava/lang/String;

.field l:I

.field m:Ljava/lang/String;

.field n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field p:Ljava/lang/String;

.field q:Ljava/lang/String;

.field r:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 152
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getIntMid()I

    move-result v0

    sput v0, Lcom/cleanmaster/util/g;->a:I

    .line 166
    sput-object v1, Lcom/cleanmaster/util/g;->b:Ljava/lang/String;

    .line 167
    sput-object v1, Lcom/cleanmaster/util/g;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 332
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/util/g;->i:Ljava/lang/String;

    .line 333
    iput v1, p0, Lcom/cleanmaster/util/g;->j:I

    .line 335
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cleanmaster/util/g;->k:Ljava/lang/String;

    .line 337
    const/4 v0, -0x1

    iput v0, p0, Lcom/cleanmaster/util/g;->l:I

    .line 338
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/util/g;->m:Ljava/lang/String;

    .line 339
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/util/g;->n:Ljava/lang/String;

    .line 340
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/util/g;->o:Ljava/lang/String;

    .line 341
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/util/g;->p:Ljava/lang/String;

    .line 343
    iput v1, p0, Lcom/cleanmaster/util/g;->r:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/cleanmaster/util/g;
    .locals 2

    .prologue
    .line 187
    const/16 v0, 0x32

    sget v1, Lcom/cleanmaster/util/g;->a:I

    invoke-static {p0, v0, v1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;II)Lcom/cleanmaster/util/g;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;II)Lcom/cleanmaster/util/g;
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 232
    new-instance v1, Lcom/cleanmaster/util/g;

    invoke-direct {v1}, Lcom/cleanmaster/util/g;-><init>()V

    .line 234
    iput-object p0, v1, Lcom/cleanmaster/util/g;->d:Ljava/lang/String;

    .line 235
    iput p2, v1, Lcom/cleanmaster/util/g;->e:I

    .line 236
    iput p1, v1, Lcom/cleanmaster/util/g;->f:I

    .line 237
    invoke-static {}, Lcom/cleanmaster/common/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/cleanmaster/util/g;->g:Ljava/lang/String;

    .line 239
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/common/a;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 240
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/common/a;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 241
    const-string v3, "%s_%s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    aput-object v2, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/cleanmaster/util/g;->h:Ljava/lang/String;

    .line 242
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getmAdResourceRp()I

    move-result v0

    if-ne v0, v6, :cond_0

    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/cleanmaster/common/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cleanmaster/common/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    :goto_0
    iput v0, v1, Lcom/cleanmaster/util/g;->j:I

    .line 245
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/util/g;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/cleanmaster/util/g;->m:Ljava/lang/String;

    .line 246
    invoke-static {}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getInstance()Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getGAId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/cleanmaster/util/g;->n:Ljava/lang/String;

    .line 247
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/util/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/cleanmaster/util/g;->p:Ljava/lang/String;

    .line 248
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getChannelId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/cleanmaster/util/g;->q:Ljava/lang/String;

    .line 249
    return-object v1

    .line 242
    :cond_0
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getmCver()I

    move-result v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/util/g;
    .locals 2

    .prologue
    .line 203
    const/16 v0, 0x24

    sget v1, Lcom/cleanmaster/util/g;->a:I

    invoke-static {p0, v0, v1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;II)Lcom/cleanmaster/util/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/cleanmaster/util/g;->e(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 253
    sget-object v0, Lcom/cleanmaster/util/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    invoke-static {p0}, Lcom/cleanmaster/common/a;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 255
    sput-object v0, Lcom/cleanmaster/util/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    const-string v0, ""

    sput-object v0, Lcom/cleanmaster/util/g;->b:Ljava/lang/String;

    .line 260
    :cond_0
    sget-object v0, Lcom/cleanmaster/util/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Lcom/cleanmaster/util/g;I)V
    .locals 0

    .prologue
    .line 275
    iput p1, p0, Lcom/cleanmaster/util/g;->r:I

    .line 276
    return-void
.end method

.method public static b(Ljava/lang/String;)Lcom/cleanmaster/util/g;
    .locals 2

    .prologue
    .line 191
    const/16 v0, 0x3c

    sget v1, Lcom/cleanmaster/util/g;->a:I

    invoke-static {p0, v0, v1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;II)Lcom/cleanmaster/util/g;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/util/g;
    .locals 2

    .prologue
    .line 207
    const/16 v0, 0x26

    sget v1, Lcom/cleanmaster/util/g;->a:I

    invoke-static {p0, v0, v1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;II)Lcom/cleanmaster/util/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/cleanmaster/util/g;->e(Ljava/lang/String;)Lcom/cleanmaster/util/g;

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 264
    sget-object v0, Lcom/cleanmaster/util/g;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    invoke-static {p0}, Lcom/cleanmaster/common/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 266
    sput-object v0, Lcom/cleanmaster/util/g;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    const-string v0, ""

    sput-object v0, Lcom/cleanmaster/util/g;->c:Ljava/lang/String;

    .line 271
    :cond_0
    sget-object v0, Lcom/cleanmaster/util/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lcom/cleanmaster/util/g;
    .locals 2

    .prologue
    .line 195
    const/16 v0, 0x3d

    sget v1, Lcom/cleanmaster/util/g;->a:I

    invoke-static {p0, v0, v1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;II)Lcom/cleanmaster/util/g;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Lcom/cleanmaster/util/g;
    .locals 2

    .prologue
    .line 199
    const/16 v0, 0x3e

    sget v1, Lcom/cleanmaster/util/g;->a:I

    invoke-static {p0, v0, v1}, Lcom/cleanmaster/util/g;->a(Ljava/lang/String;II)Lcom/cleanmaster/util/g;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ac="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/cleanmaster/util/g;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&pos="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&mid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/cleanmaster/util/g;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&aid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&lan="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&ext="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&cmver="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/cleanmaster/util/g;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    iget-object v1, p0, Lcom/cleanmaster/util/g;->k:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 310
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&rf="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    :cond_0
    iget v1, p0, Lcom/cleanmaster/util/g;->l:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 313
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&g_pg="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/cleanmaster/util/g;->l:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&mcc="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&mnc="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&gaid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&placementid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    const-string v1, "&pl=2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    const-string v1, "&v=16"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&channelid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/g;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&lp="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/cleanmaster/util/g;->r:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/cleanmaster/util/g;
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lcom/cleanmaster/util/g;->k:Ljava/lang/String;

    .line 280
    return-object p0
.end method
