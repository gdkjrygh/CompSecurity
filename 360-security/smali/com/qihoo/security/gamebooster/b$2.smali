.class Lcom/qihoo/security/gamebooster/b$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/h;

.field final synthetic b:Lcom/qihoo/security/gamebooster/g;

.field final synthetic c:Lcom/qihoo/security/gamebooster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V
    .locals 0

    .prologue
    .line 700
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b$2;->c:Lcom/qihoo/security/gamebooster/b;

    iput-object p2, p0, Lcom/qihoo/security/gamebooster/b$2;->a:Lcom/qihoo/security/gamebooster/h;

    iput-object p3, p0, Lcom/qihoo/security/gamebooster/b$2;->b:Lcom/qihoo/security/gamebooster/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 704
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$2;->a:Lcom/qihoo/security/gamebooster/h;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b$2;->b:Lcom/qihoo/security/gamebooster/g;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/gamebooster/h;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 705
    return-void
.end method
