.class final Lcom/kik/sdkutils/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/sdkutils/i;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/i;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/kik/sdkutils/j;->a:Lcom/kik/sdkutils/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/kik/sdkutils/j;->a:Lcom/kik/sdkutils/i;

    iget-object v0, v0, Lcom/kik/sdkutils/i;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 83
    return-void
.end method
