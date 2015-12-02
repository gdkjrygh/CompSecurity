.class Lcom/qihoo360/mobilesafe/support/a$1;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a$1;->a:Landroid/content/Context;

    .line 79
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 81
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->a(Z)V

    .line 83
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 85
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a$1;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/support/a/f;

    move-result-object v1

    .line 86
    if-eqz v1, :cond_0

    .line 87
    const-wide/16 v2, 0x4e20

    invoke-interface {v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/b;->a(J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a$1;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/support/a;->b(Landroid/content/Context;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->a(Z)V

    .line 92
    return-void

    .line 88
    :catch_0
    move-exception v1

    goto :goto_0
.end method
