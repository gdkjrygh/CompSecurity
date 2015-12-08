.class final Lcom/kik/sdkutils/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/kik/sdkutils/m;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/m;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/kik/sdkutils/r;->b:Lcom/kik/sdkutils/m;

    iput-object p2, p0, Lcom/kik/sdkutils/r;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Lcom/kik/sdkutils/r;->b:Lcom/kik/sdkutils/m;

    iget-object v0, v0, Lcom/kik/sdkutils/m;->b:Lcom/kik/g/r;

    iget-object v1, p0, Lcom/kik/sdkutils/r;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    .line 193
    return-void
.end method
