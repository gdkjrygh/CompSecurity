.class final Lcom/kik/sdkutils/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/sdkutils/s;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/s;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lcom/kik/sdkutils/t;->a:Lcom/kik/sdkutils/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 298
    iget-object v0, p0, Lcom/kik/sdkutils/t;->a:Lcom/kik/sdkutils/s;

    iget-object v0, v0, Lcom/kik/sdkutils/s;->b:Lcom/kik/g/r;

    invoke-virtual {v0}, Lcom/kik/g/r;->a()V

    .line 299
    return-void
.end method
