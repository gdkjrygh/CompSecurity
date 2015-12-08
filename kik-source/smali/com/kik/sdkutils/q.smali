.class final Lcom/kik/sdkutils/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lcom/kik/sdkutils/m;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/m;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/kik/sdkutils/q;->b:Lcom/kik/sdkutils/m;

    iput-object p2, p0, Lcom/kik/sdkutils/q;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 180
    iget-object v0, p0, Lcom/kik/sdkutils/q;->b:Lcom/kik/sdkutils/m;

    iget-object v0, v0, Lcom/kik/sdkutils/m;->b:Lcom/kik/g/r;

    iget-object v1, p0, Lcom/kik/sdkutils/q;->a:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 181
    return-void
.end method
