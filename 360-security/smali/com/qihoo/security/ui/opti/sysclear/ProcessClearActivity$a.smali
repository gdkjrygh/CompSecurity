.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;
.super Landroid/widget/BaseExpandableListAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;,
        Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

.field private e:I

.field private f:I

.field private g:I

.field private final h:J


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1280
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 1268
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    .line 1269
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    .line 1275
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->e()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->h:J

    .line 1281
    invoke-direct {p0, p2, p3, p4}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1282
    return-void
.end method

.method private a(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 1357
    const/4 v0, 0x0

    .line 1358
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1359
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1360
    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    add-int/2addr v0, v1

    move v1, v0

    .line 1361
    goto :goto_0

    :cond_0
    move v0, v1

    .line 1363
    :cond_1
    return v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1349
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1350
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1353
    :cond_0
    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 1267
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V
    .locals 0

    .prologue
    .line 1267
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V

    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v10, 0x1

    const/4 v3, 0x0

    .line 1287
    iput v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e:I

    .line 1288
    iput v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f:I

    .line 1289
    iput v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->g:I

    .line 1290
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1291
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1293
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " Rom "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0017

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1295
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    const-string/jumbo v1, "rom_sys_info"

    const/4 v7, 0x0

    move v4, v3

    move v5, v3

    move v6, v3

    move v8, v3

    invoke-direct/range {v0 .. v8}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;-><init>(Ljava/lang/String;Ljava/lang/String;IZZZ[II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->d:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1297
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Ljava/util/List;)I

    move-result v0

    .line 1298
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->d:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a(I)V

    .line 1299
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1300
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->d:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1301
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1302
    const/16 v1, 0x2c8f

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    mul-int/lit8 v0, v0, 0x64

    int-to-long v6, v0

    iget-wide v8, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->h:J

    div-long/2addr v6, v8

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1306
    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1307
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1308
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1309
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1310
    const/16 v1, 0x2c90

    iget-object v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->b:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    mul-int/lit8 v0, v0, 0x64

    int-to-long v4, v0

    iget-wide v6, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->h:J

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1313
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v10, :cond_1

    .line 1314
    invoke-interface {p2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1315
    const/16 v1, 0x2c91

    iget-object v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->b:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    mul-int/lit8 v0, v0, 0x64

    int-to-long v4, v0

    iget-wide v6, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->h:J

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1322
    :cond_1
    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1323
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1325
    :cond_2
    return-void
.end method

.method private b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V
    .locals 8

    .prologue
    const/4 v3, 0x1

    .line 1814
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 1815
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 1817
    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v0, v1, v2

    aput v3, v1, v3

    invoke-static {v1}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    move-result-object v7

    .line 1820
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;

    move-object v1, p0

    move-object v2, p1

    move v3, p4

    move-object v4, p3

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Landroid/view/View;ZLcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;I)V

    invoke-virtual {v7, v0}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 1860
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;

    invoke-direct {v0, p0, v6, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View;)V

    invoke-virtual {v7, v0}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 1868
    invoke-virtual {v7}, Lcom/nineoldandroids/a/o;->a()V

    .line 1869
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V
    .locals 0

    .prologue
    .line 1267
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->l()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)I
    .locals 2

    .prologue
    .line 1267
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->g:I

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)I
    .locals 2

    .prologue
    .line 1267
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)I
    .locals 2

    .prologue
    .line 1267
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f:I

    return v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 1267
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V
    .locals 0

    .prologue
    .line 1267
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->m()V

    return-void
.end method

.method private l()V
    .locals 10

    .prologue
    const/4 v8, 0x0

    .line 1732
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 1733
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ExpandableListView;->getChildCount()I

    move-result v9

    .line 1734
    new-instance v1, Lcom/qihoo/security/a/a/a;

    const/4 v2, 0x2

    const/4 v3, 0x3

    const-wide/16 v4, 0x14

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->s(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v6

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->t(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v7

    invoke-direct/range {v1 .. v7}, Lcom/qihoo/security/a/a/a;-><init>(IIJII)V

    .line 1739
    if-lez v9, :cond_2

    move v0, v8

    .line 1740
    :goto_0
    if-ge v0, v9, :cond_0

    .line 1741
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/ExpandableListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1742
    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1743
    invoke-virtual {v1, v2}, Lcom/qihoo/security/a/a/a;->a(Landroid/view/View;)V

    .line 1740
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1745
    :cond_0
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$4;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V

    invoke-virtual {v1, v0}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a$a;)V

    .line 1756
    invoke-virtual {v1}, Lcom/qihoo/security/a/a/a;->a()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1757
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    invoke-static {v0, v8, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;II)V

    .line 1758
    invoke-virtual {v1}, Lcom/qihoo/security/a/a/a;->b()V

    .line 1759
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    .line 1767
    :cond_1
    :goto_1
    return-void

    .line 1765
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v1

    invoke-static {v0, v8, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;II)V

    goto :goto_1
.end method

.method private m()V
    .locals 2

    .prologue
    .line 1875
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1876
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->g(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1878
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)V

    .line 1883
    :cond_0
    :goto_0
    return-void

    .line 1880
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)V

    goto :goto_0
.end method

.method private n()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1904
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1905
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1906
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1907
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1909
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1910
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1914
    :cond_1
    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;
    .locals 1

    .prologue
    .line 1387
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    goto :goto_0
.end method

.method public a(II)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1392
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    if-nez v1, :cond_1

    .line 1400
    :cond_0
    :goto_0
    return-object v0

    .line 1395
    :cond_1
    if-nez p1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_0

    .line 1398
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1331
    invoke-direct {p0, v0, v0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1332
    return-void
.end method

.method public a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V
    .locals 1

    .prologue
    .line 1772
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V

    .line 1775
    return-void
.end method

.method public a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V
    .locals 7

    .prologue
    .line 1788
    if-nez p1, :cond_0

    .line 1808
    :goto_0
    return-void

    .line 1792
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    .line 1793
    invoke-static {p1}, Lcom/nineoldandroids/b/b;->a(Landroid/view/View;)Lcom/nineoldandroids/b/b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->a(F)Lcom/nineoldandroids/b/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->c(F)Lcom/nineoldandroids/b/b;

    move-result-object v0

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/b/b;->a(J)Lcom/nineoldandroids/b/b;

    move-result-object v6

    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$5;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$5;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V

    invoke-virtual {v6, v0}, Lcom/nineoldandroids/b/b;->a(Lcom/nineoldandroids/a/a$a;)Lcom/nineoldandroids/b/b;

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V
    .locals 3

    .prologue
    .line 2120
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(I)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    .line 2121
    if-eqz p1, :cond_0

    if-eq v0, p1, :cond_0

    .line 2122
    iget v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    iget v2, p1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    sub-int/2addr v1, v2

    .line 2123
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a(I)V

    .line 2124
    if-nez v1, :cond_0

    .line 2125
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->d:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2126
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->notifyDataSetChanged()V

    .line 2130
    :cond_0
    return-void
.end method

.method public b(II)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;
    .locals 2

    .prologue
    .line 2083
    const/4 v0, 0x0

    .line 2084
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v1

    if-nez v1, :cond_0

    .line 2098
    :goto_0
    return-object v0

    .line 2087
    :cond_0
    if-nez p1, :cond_2

    .line 2088
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2089
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(II)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    goto :goto_0

    .line 2091
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(I)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    goto :goto_0

    .line 2095
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(I)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V
    .locals 1

    .prologue
    .line 1780
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V

    .line 1782
    return-void
.end method

.method public b()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1338
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->getGroupCount()I

    move-result v1

    .line 1339
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v2

    if-eqz v2, :cond_0

    if-lez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x7

    if-ge v1, v2, :cond_0

    .line 1341
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 1342
    const/4 v0, 0x1

    .line 1344
    :cond_0
    return v0
.end method

.method public b(I)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2108
    .line 2109
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2110
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(I)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v3

    .line 2111
    iget-object v0, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string/jumbo v4, "rom_sys_info"

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    move v2, v1

    .line 2116
    :cond_0
    return v2

    :cond_1
    move v0, v2

    .line 2111
    goto :goto_0
.end method

.method public c()V
    .locals 3

    .prologue
    .line 1698
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-gt v0, v1, :cond_1

    .line 1699
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;II)V

    .line 1729
    :cond_0
    :goto_0
    return-void

    .line 1701
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1702
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 1703
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public d()Z
    .locals 2

    .prologue
    .line 1891
    const/4 v0, 0x1

    .line 1892
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1893
    const/4 v0, 0x0

    .line 1895
    :cond_0
    return v0
.end method

.method public e()Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1921
    .line 1922
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->n()Ljava/util/List;

    move-result-object v0

    .line 1923
    if-eqz v0, :cond_3

    .line 1924
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 1925
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1927
    iget-boolean v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-nez v4, :cond_0

    .line 1928
    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-nez v0, :cond_0

    move v0, v1

    .line 1942
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 1933
    goto :goto_0

    :cond_2
    move v0, v2

    .line 1936
    goto :goto_0

    .line 1938
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->u(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->u(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v2

    .line 1940
    goto :goto_0

    :cond_4
    move v0, v1

    .line 1942
    goto :goto_0
.end method

.method public f()Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1949
    .line 1950
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->n()Ljava/util/List;

    move-result-object v0

    .line 1951
    if-eqz v0, :cond_3

    .line 1952
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 1953
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1955
    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-nez v0, :cond_0

    move v0, v1

    .line 1965
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 1959
    goto :goto_0

    :cond_2
    move v0, v2

    .line 1962
    goto :goto_0

    :cond_3
    move v0, v1

    .line 1965
    goto :goto_0
.end method

.method public g()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 1975
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1976
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->n()Ljava/util/List;

    move-result-object v4

    .line 1977
    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1978
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1980
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    :goto_0
    const-string/jumbo v5, "rom_sys_info"

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 1982
    invoke-interface {v4, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1987
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1988
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v2, :cond_1

    .line 1989
    new-instance v2, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v2}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 1990
    iget-object v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    iput-object v4, v2, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 1991
    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    iput v0, v2, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 1992
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move v1, v2

    .line 1980
    goto :goto_0

    .line 1996
    :cond_3
    return-object v3
.end method

.method public synthetic getChild(II)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1267
    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(II)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .prologue
    .line 1411
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1594
    if-nez p4, :cond_0

    .line 1595
    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V

    .line 1596
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->p(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030086

    invoke-virtual {v0, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 1598
    const v0, 0x7f0b0075

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1600
    const v0, 0x7f0b01bd

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1602
    const v0, 0x7f0b01b2

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1604
    const v0, 0x7f0b01af

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->e:Landroid/widget/CheckBox;

    .line 1606
    const v0, 0x7f0b0074

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->a:Landroid/widget/ImageView;

    .line 1608
    invoke-virtual {p4, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1613
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1615
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->b:Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1616
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v2, :cond_1

    .line 1617
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c001e

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1626
    :goto_1
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1627
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->r(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/b/g;

    move-result-object v2

    iget-object v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v6}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1628
    if-eqz v2, :cond_2

    .line 1629
    iget-object v3, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->a:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1635
    :goto_2
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v2, :cond_3

    .line 1636
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->e:Landroid/widget/CheckBox;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1641
    :goto_3
    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->e:Landroid/widget/CheckBox;

    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1677
    return-object p4

    .line 1610
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;

    move-object v1, v0

    goto :goto_0

    .line 1621
    :cond_1
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c001f

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1631
    :cond_2
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->a:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->q(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f020043

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 1638
    :cond_3
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$a;->e:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_3
.end method

.method public getChildrenCount(I)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1376
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    if-lez p1, :cond_1

    .line 1382
    :cond_0
    :goto_0
    return v0

    .line 1379
    :cond_1
    if-nez p1, :cond_0

    .line 1380
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public synthetic getGroup(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1267
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(I)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .prologue
    .line 1368
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1369
    const/4 v0, 0x0

    .line 1371
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getGroupId(I)J
    .locals 2

    .prologue
    .line 1406
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    .line 1429
    if-nez p3, :cond_1

    .line 1430
    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V

    .line 1431
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->p(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030087

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 1433
    const v0, 0x7f0b0075

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1435
    const v0, 0x7f0b01bd

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1437
    const v0, 0x7f0b01b2

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1439
    const v0, 0x7f0b01be

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1441
    const v0, 0x7f0b01af

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    .line 1443
    const v0, 0x7f0b0074

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->a:Landroid/widget/ImageView;

    .line 1444
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v2, v1

    .line 1449
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1451
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->b:Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1452
    iget-boolean v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v1, :cond_2

    .line 1453
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c001e

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1456
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1464
    :goto_1
    iget v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    if-nez v1, :cond_0

    .line 1466
    const/16 v1, 0x400

    iput v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    .line 1468
    :cond_0
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1470
    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    const-string/jumbo v3, "rom_sys_info"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1471
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->a:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->q(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f02004b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1473
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c0035

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1475
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1476
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    .line 1477
    const/4 v1, 0x0

    .line 1478
    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v3, v1

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1479
    iget-boolean v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v1, :cond_c

    .line 1480
    add-int/lit8 v1, v3, 0x1

    :goto_3
    move v3, v1

    .line 1484
    goto :goto_2

    .line 1446
    :cond_1
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;

    move-object v2, v0

    goto/16 :goto_0

    .line 1461
    :cond_2
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_1

    .line 1486
    :cond_3
    if-ne v4, v3, :cond_5

    .line 1488
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1489
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const v3, 0x7f020055

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1537
    :cond_4
    :goto_4
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1586
    return-object p3

    .line 1490
    :cond_5
    if-eq v4, v3, :cond_6

    if-eqz v3, :cond_6

    .line 1493
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1494
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const v3, 0x7f020056

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    goto :goto_4

    .line 1495
    :cond_6
    if-nez v3, :cond_4

    .line 1497
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1498
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const v3, 0x7f020054

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    goto :goto_4

    .line 1502
    :cond_7
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1503
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->r(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/b/g;

    move-result-object v1

    iget-object v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 1505
    if-eqz v1, :cond_8

    .line 1506
    iget-object v3, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->a:Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1512
    :goto_5
    iget-boolean v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v1, :cond_a

    .line 1515
    iget-boolean v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v1, :cond_9

    .line 1516
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const v3, 0x7f020055

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1518
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_4

    .line 1508
    :cond_8
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->a:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->q(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f020043

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_5

    .line 1520
    :cond_9
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const v3, 0x7f020054

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1522
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto/16 :goto_4

    .line 1525
    :cond_a
    iget-boolean v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v1, :cond_b

    .line 1526
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const v3, 0x7f020055

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1528
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto/16 :goto_4

    .line 1530
    :cond_b
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    const v3, 0x7f020054

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1532
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto/16 :goto_4

    :cond_c
    move v1, v3

    goto/16 :goto_3
.end method

.method public h()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 2006
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2007
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->n()Ljava/util/List;

    move-result-object v4

    .line 2008
    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2009
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 2011
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    :goto_0
    const-string/jumbo v5, "rom_sys_info"

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 2013
    invoke-interface {v4, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2015
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 2016
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v2, :cond_1

    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v2, :cond_1

    .line 2017
    new-instance v2, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v2}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 2018
    iget-object v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    iput-object v4, v2, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 2019
    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    iput v0, v2, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 2020
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move v1, v2

    .line 2011
    goto :goto_0

    .line 2024
    :cond_3
    return-object v3
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 1416
    const/4 v0, 0x0

    return v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 2133
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e:I

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .prologue
    .line 1421
    const/4 v0, 0x1

    return v0
.end method

.method public j()I
    .locals 1

    .prologue
    .line 2137
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f:I

    return v0
.end method

.method public k()[I
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2165
    const/4 v0, 0x2

    new-array v6, v0, [I

    .line 2167
    iget v5, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e:I

    .line 2168
    iget v4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f:I

    .line 2170
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->n()Ljava/util/List;

    move-result-object v7

    .line 2171
    if-eqz v7, :cond_4

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2172
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 2174
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    move v1, v2

    :goto_0
    const-string/jumbo v8, "rom_sys_info"

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 2176
    invoke-interface {v7, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2178
    :cond_0
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v1, v4

    move v4, v5

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 2179
    iget-boolean v5, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v5, :cond_1

    iget-boolean v5, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-nez v5, :cond_1

    .line 2182
    add-int/lit8 v4, v4, 0x1

    .line 2185
    :cond_1
    iget-boolean v5, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v5, :cond_5

    .line 2186
    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->j:I

    const/4 v5, 0x3

    if-lt v0, v5, :cond_5

    .line 2187
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    :goto_2
    move v1, v0

    .line 2190
    goto :goto_1

    :cond_2
    move v1, v3

    .line 2174
    goto :goto_0

    :cond_3
    move v5, v4

    move v4, v1

    .line 2192
    :cond_4
    aput v5, v6, v3

    .line 2193
    aput v4, v6, v2

    .line 2194
    return-object v6

    :cond_5
    move v0, v1

    goto :goto_2
.end method
