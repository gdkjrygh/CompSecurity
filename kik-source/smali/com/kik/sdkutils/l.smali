.class final Lcom/kik/sdkutils/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/kik/sdkutils/i;


# direct methods
.method constructor <init>(Lcom/kik/sdkutils/i;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/kik/sdkutils/l;->b:Lcom/kik/sdkutils/i;

    iput-object p2, p0, Lcom/kik/sdkutils/l;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 118
    iget-object v0, p0, Lcom/kik/sdkutils/l;->b:Lcom/kik/sdkutils/i;

    iget-object v0, v0, Lcom/kik/sdkutils/i;->b:Lcom/kik/g/p;

    iget-object v1, p0, Lcom/kik/sdkutils/l;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 119
    return-void
.end method
