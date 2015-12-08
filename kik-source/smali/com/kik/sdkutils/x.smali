.class final Lcom/kik/sdkutils/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/kik/sdkutils/s;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/s;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 366
    iput-object p1, p0, Lcom/kik/sdkutils/x;->b:Lcom/kik/sdkutils/s;

    iput-object p2, p0, Lcom/kik/sdkutils/x;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 370
    iget-object v0, p0, Lcom/kik/sdkutils/x;->b:Lcom/kik/sdkutils/s;

    iget-object v0, v0, Lcom/kik/sdkutils/s;->b:Lcom/kik/g/r;

    iget-object v1, p0, Lcom/kik/sdkutils/x;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    .line 371
    return-void
.end method
