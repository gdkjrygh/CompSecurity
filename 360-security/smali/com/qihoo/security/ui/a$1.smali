.class final Lcom/qihoo/security/ui/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/a;->e(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lcom/qihoo/security/ui/a$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 308
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/k;->a()Lcom/qihoo360/mobilesafe/b/k;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/a$1;->a:Landroid/content/Context;

    const v2, 0x7f0c00c7

    const v3, 0x7f0c00c8

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/b/k;->a(Landroid/content/Context;II)V

    .line 310
    return-void
.end method
