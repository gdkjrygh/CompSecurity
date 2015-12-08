.class final Lcom/kik/sdkutils/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/kik/sdkutils/b;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/b;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/kik/sdkutils/c;->c:Lcom/kik/sdkutils/b;

    iput-object p2, p0, Lcom/kik/sdkutils/c;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/kik/sdkutils/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lcom/kik/sdkutils/c;->c:Lcom/kik/sdkutils/b;

    iget-object v0, v0, Lcom/kik/sdkutils/b;->b:Lcom/kik/g/i;

    iget-object v1, p0, Lcom/kik/sdkutils/c;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/kik/sdkutils/c;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    return-void
.end method
