.class Lcom/qihoo/security/ui/b/a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/b/a;->a(Lcom/qihoo/security/ui/b/a$d;)Lcom/qihoo/security/ui/b/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/b/a$c;

.field final synthetic b:Lcom/qihoo/security/ui/b/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/b/a;Lcom/qihoo/security/ui/b/a$c;)V
    .locals 0

    .prologue
    .line 311
    iput-object p1, p0, Lcom/qihoo/security/ui/b/a$2;->b:Lcom/qihoo/security/ui/b/a;

    iput-object p2, p0, Lcom/qihoo/security/ui/b/a$2;->a:Lcom/qihoo/security/ui/b/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 313
    sget-object v0, Lcom/qihoo/security/ui/b/a;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/qihoo/security/ui/b/a$2;->a:Lcom/qihoo/security/ui/b/a$c;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 314
    return-void
.end method
