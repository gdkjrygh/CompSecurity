.class public Lcom/qihoo/security/engine/b/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/qihoo/security/engine/a;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qihoo/security/engine/b/f;->a:Lcom/qihoo/security/engine/a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/f;->a:Lcom/qihoo/security/engine/a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/a;->a()I

    return-void
.end method
