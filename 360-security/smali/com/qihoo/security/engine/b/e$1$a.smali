.class Lcom/qihoo/security/engine/b/e$1$a;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/b/e$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/engine/b/e$1;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/b/e$1;Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/b/e$1$a;->a:Lcom/qihoo/security/engine/b/e$1;

    invoke-direct {p0, p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    invoke-super {p0}, Ljava/lang/Thread;->run()V

    return-void
.end method
