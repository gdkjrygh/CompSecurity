.class public Landroid/support/v4/app/q$d;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:Ljava/lang/CharSequence;

.field c:Ljava/lang/CharSequence;

.field d:Landroid/app/PendingIntent;

.field e:Landroid/app/PendingIntent;

.field f:Landroid/widget/RemoteViews;

.field g:Landroid/graphics/Bitmap;

.field h:Ljava/lang/CharSequence;

.field i:I

.field j:I

.field k:Z

.field l:Landroid/support/v4/app/q$n;

.field m:Ljava/lang/CharSequence;

.field n:I

.field o:I

.field p:Z

.field q:Ljava/lang/String;

.field r:Z

.field s:Ljava/lang/String;

.field t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/q$a;",
            ">;"
        }
    .end annotation
.end field

.field u:Z

.field v:Landroid/os/Bundle;

.field w:Landroid/app/Notification;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 676
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 659
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/q$d;->t:Ljava/util/ArrayList;

    .line 660
    iput-boolean v4, p0, Landroid/support/v4/app/q$d;->u:Z

    .line 663
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    .line 677
    iput-object p1, p0, Landroid/support/v4/app/q$d;->a:Landroid/content/Context;

    .line 680
    iget-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Landroid/app/Notification;->when:J

    .line 681
    iget-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    const/4 v1, -0x1

    iput v1, v0, Landroid/app/Notification;->audioStreamType:I

    .line 682
    iput v4, p0, Landroid/support/v4/app/q$d;->j:I

    .line 683
    return-void
.end method

.method private a(IZ)V
    .locals 3

    .prologue
    .line 990
    if-eqz p2, :cond_0

    .line 991
    iget-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/2addr v1, p1

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 995
    :goto_0
    return-void

    .line 993
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    xor-int/lit8 v2, p1, -0x1

    and-int/2addr v1, v2

    iput v1, v0, Landroid/app/Notification;->flags:I

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/app/Notification;
    .locals 1

    .prologue
    .line 1196
    invoke-static {}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/q$f;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/support/v4/app/q$f;->a(Landroid/support/v4/app/q$d;)Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public a(I)Landroid/support/v4/app/q$d;
    .locals 1

    .prologue
    .line 718
    iget-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    .line 719
    return-object p0
.end method

.method public a(J)Landroid/support/v4/app/q$d;
    .locals 1

    .prologue
    .line 690
    iget-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    .line 691
    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Landroid/support/v4/app/q$d;
    .locals 1

    .prologue
    .line 854
    iget-object v0, p0, Landroid/support/v4/app/q$d;->w:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 855
    return-object p0
.end method

.method public a(Ljava/lang/String;)Landroid/support/v4/app/q$d;
    .locals 0

    .prologue
    .line 1060
    iput-object p1, p0, Landroid/support/v4/app/q$d;->s:Ljava/lang/String;

    .line 1061
    return-object p0
.end method

.method public a(Z)Landroid/support/v4/app/q$d;
    .locals 1

    .prologue
    .line 936
    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Landroid/support/v4/app/q$d;->a(IZ)V

    .line 937
    return-object p0
.end method

.method public b(I)Landroid/support/v4/app/q$d;
    .locals 0

    .prologue
    .line 1015
    iput p1, p0, Landroid/support/v4/app/q$d;->j:I

    .line 1016
    return-object p0
.end method
