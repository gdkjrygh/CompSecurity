.class Lcom/qihoo/security/engine/b/g$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/engine/b/g;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/engine/b/g;


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/b/g;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/b/g$2;->a:Lcom/qihoo/security/engine/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$2;->a:Lcom/qihoo/security/engine/b/g;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/g;->e:Lcom/qihoo/security/engine/b/g$a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g$a;->b()V

    return-void
.end method
