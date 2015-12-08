.class final Lcom/kik/cards/web/l;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 595
    iput-object p1, p0, Lcom/kik/cards/web/l;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 595
    iget-object v0, p0, Lcom/kik/cards/web/l;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to load"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    return-void
.end method
