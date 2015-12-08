.class final Lcom/kik/sdkutils/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/kik/sdkutils/e;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/e;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/kik/sdkutils/h;->b:Lcom/kik/sdkutils/e;

    iput-object p2, p0, Lcom/kik/sdkutils/h;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lcom/kik/sdkutils/h;->b:Lcom/kik/sdkutils/e;

    iget-object v0, v0, Lcom/kik/sdkutils/e;->b:Lcom/kik/g/p;

    iget-object v1, p0, Lcom/kik/sdkutils/h;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 55
    return-void
.end method
