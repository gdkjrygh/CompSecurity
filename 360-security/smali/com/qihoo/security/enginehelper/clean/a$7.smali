.class Lcom/qihoo/security/enginehelper/clean/a$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$7;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$7;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 129
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$7;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 130
    return-void
.end method
