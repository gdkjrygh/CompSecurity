.class final Lcom/kik/sdkutils/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lcom/kik/sdkutils/e;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/e;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/kik/sdkutils/g;->b:Lcom/kik/sdkutils/e;

    iput-object p2, p0, Lcom/kik/sdkutils/g;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/kik/sdkutils/g;->b:Lcom/kik/sdkutils/e;

    iget-object v0, v0, Lcom/kik/sdkutils/e;->b:Lcom/kik/g/p;

    iget-object v1, p0, Lcom/kik/sdkutils/g;->a:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 43
    return-void
.end method
