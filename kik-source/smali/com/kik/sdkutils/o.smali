.class final Lcom/kik/sdkutils/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/sdkutils/m;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/m;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/kik/sdkutils/o;->a:Lcom/kik/sdkutils/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/kik/sdkutils/o;->a:Lcom/kik/sdkutils/m;

    iget-object v0, v0, Lcom/kik/sdkutils/m;->b:Lcom/kik/g/r;

    invoke-virtual {v0}, Lcom/kik/g/r;->b()V

    .line 157
    return-void
.end method
