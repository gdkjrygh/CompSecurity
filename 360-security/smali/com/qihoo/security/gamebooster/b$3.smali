.class Lcom/qihoo/security/gamebooster/b$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/receiver/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 709
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b$3;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 714
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 719
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 726
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$3;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->j(Lcom/qihoo/security/gamebooster/b;)Ljava/util/Hashtable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$3;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->j(Lcom/qihoo/security/gamebooster/b;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 727
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$3;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->j(Lcom/qihoo/security/gamebooster/b;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 729
    :cond_0
    return-void
.end method
