.class public Landroid/support/v4/app/q;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/q$a;,
        Landroid/support/v4/app/q$e;,
        Landroid/support/v4/app/q$c;,
        Landroid/support/v4/app/q$b;,
        Landroid/support/v4/app/q$n;,
        Landroid/support/v4/app/q$d;,
        Landroid/support/v4/app/q$g;,
        Landroid/support/v4/app/q$m;,
        Landroid/support/v4/app/q$l;,
        Landroid/support/v4/app/q$k;,
        Landroid/support/v4/app/q$j;,
        Landroid/support/v4/app/q$i;,
        Landroid/support/v4/app/q$h;,
        Landroid/support/v4/app/q$f;
    }
.end annotation


# static fields
.field private static final a:Landroid/support/v4/app/q$f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 601
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    .line 602
    new-instance v0, Landroid/support/v4/app/q$g;

    invoke-direct {v0}, Landroid/support/v4/app/q$g;-><init>()V

    sput-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    .line 616
    :goto_0
    return-void

    .line 603
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 604
    new-instance v0, Landroid/support/v4/app/q$m;

    invoke-direct {v0}, Landroid/support/v4/app/q$m;-><init>()V

    sput-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    goto :goto_0

    .line 605
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 606
    new-instance v0, Landroid/support/v4/app/q$l;

    invoke-direct {v0}, Landroid/support/v4/app/q$l;-><init>()V

    sput-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    goto :goto_0

    .line 607
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_3

    .line 608
    new-instance v0, Landroid/support/v4/app/q$k;

    invoke-direct {v0}, Landroid/support/v4/app/q$k;-><init>()V

    sput-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    goto :goto_0

    .line 609
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    .line 610
    new-instance v0, Landroid/support/v4/app/q$j;

    invoke-direct {v0}, Landroid/support/v4/app/q$j;-><init>()V

    sput-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    goto :goto_0

    .line 611
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_5

    .line 612
    new-instance v0, Landroid/support/v4/app/q$i;

    invoke-direct {v0}, Landroid/support/v4/app/q$i;-><init>()V

    sput-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    goto :goto_0

    .line 614
    :cond_5
    new-instance v0, Landroid/support/v4/app/q$h;

    invoke-direct {v0}, Landroid/support/v4/app/q$h;-><init>()V

    sput-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    goto :goto_0
.end method

.method public static a(Landroid/app/Notification;)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 2397
    sget-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    invoke-interface {v0, p0}, Landroid/support/v4/app/q$f;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a()Landroid/support/v4/app/q$f;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Landroid/support/v4/app/q;->a:Landroid/support/v4/app/q$f;

    return-object v0
.end method

.method static synthetic a(Landroid/support/v4/app/o;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 40
    invoke-static {p0, p1}, Landroid/support/v4/app/q;->b(Landroid/support/v4/app/o;Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic a(Landroid/support/v4/app/p;Landroid/support/v4/app/q$n;)V
    .locals 0

    .prologue
    .line 40
    invoke-static {p0, p1}, Landroid/support/v4/app/q;->b(Landroid/support/v4/app/p;Landroid/support/v4/app/q$n;)V

    return-void
.end method

.method private static b(Landroid/support/v4/app/o;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/o;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/q$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 565
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/q$a;

    .line 566
    invoke-interface {p0, v0}, Landroid/support/v4/app/o;->a(Landroid/support/v4/app/s$a;)V

    goto :goto_0

    .line 568
    :cond_0
    return-void
.end method

.method private static b(Landroid/support/v4/app/p;Landroid/support/v4/app/q$n;)V
    .locals 7

    .prologue
    .line 572
    if-eqz p1, :cond_0

    .line 573
    instance-of v0, p1, Landroid/support/v4/app/q$c;

    if-eqz v0, :cond_1

    .line 574
    check-cast p1, Landroid/support/v4/app/q$c;

    .line 575
    iget-object v0, p1, Landroid/support/v4/app/q$c;->d:Ljava/lang/CharSequence;

    iget-boolean v1, p1, Landroid/support/v4/app/q$c;->f:Z

    iget-object v2, p1, Landroid/support/v4/app/q$c;->e:Ljava/lang/CharSequence;

    iget-object v3, p1, Landroid/support/v4/app/q$c;->a:Ljava/lang/CharSequence;

    invoke-static {p0, v0, v1, v2, v3}, Landroid/support/v4/app/w;->a(Landroid/support/v4/app/p;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 598
    :cond_0
    :goto_0
    return-void

    .line 580
    :cond_1
    instance-of v0, p1, Landroid/support/v4/app/q$e;

    if-eqz v0, :cond_2

    .line 581
    check-cast p1, Landroid/support/v4/app/q$e;

    .line 582
    iget-object v0, p1, Landroid/support/v4/app/q$e;->d:Ljava/lang/CharSequence;

    iget-boolean v1, p1, Landroid/support/v4/app/q$e;->f:Z

    iget-object v2, p1, Landroid/support/v4/app/q$e;->e:Ljava/lang/CharSequence;

    iget-object v3, p1, Landroid/support/v4/app/q$e;->a:Ljava/util/ArrayList;

    invoke-static {p0, v0, v1, v2, v3}, Landroid/support/v4/app/w;->a(Landroid/support/v4/app/p;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 587
    :cond_2
    instance-of v0, p1, Landroid/support/v4/app/q$b;

    if-eqz v0, :cond_0

    .line 588
    check-cast p1, Landroid/support/v4/app/q$b;

    .line 589
    iget-object v1, p1, Landroid/support/v4/app/q$b;->d:Ljava/lang/CharSequence;

    iget-boolean v2, p1, Landroid/support/v4/app/q$b;->f:Z

    iget-object v3, p1, Landroid/support/v4/app/q$b;->e:Ljava/lang/CharSequence;

    iget-object v4, p1, Landroid/support/v4/app/q$b;->a:Landroid/graphics/Bitmap;

    iget-object v5, p1, Landroid/support/v4/app/q$b;->b:Landroid/graphics/Bitmap;

    iget-boolean v6, p1, Landroid/support/v4/app/q$b;->c:Z

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid/support/v4/app/w;->a(Landroid/support/v4/app/p;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Z)V

    goto :goto_0
.end method
