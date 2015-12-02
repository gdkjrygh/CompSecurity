.class Lcom/qihoo/security/enginehelper/clean/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/a$b;

.field final synthetic b:Lcom/qihoo/security/enginehelper/clean/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;Lcom/qihoo/security/enginehelper/clean/a$b;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$1;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iput-object p2, p0, Lcom/qihoo/security/enginehelper/clean/a$1;->a:Lcom/qihoo/security/enginehelper/clean/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 114
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$1;->b:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$1;->b:Lcom/qihoo/security/enginehelper/clean/a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a$1;->a:Lcom/qihoo/security/enginehelper/clean/a$b;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$1;->b:Lcom/qihoo/security/enginehelper/clean/a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a$1;->a:Lcom/qihoo/security/enginehelper/clean/a$b;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 118
    return-void
.end method
