.class final Lcom/kik/sdkutils/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/sdkutils/e;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/e;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/kik/sdkutils/f;->a:Lcom/kik/sdkutils/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/sdkutils/f;->a:Lcom/kik/sdkutils/e;

    iget-object v0, v0, Lcom/kik/sdkutils/e;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 31
    return-void
.end method
