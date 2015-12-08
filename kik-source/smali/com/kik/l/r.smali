.class final Lcom/kik/l/r;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/l/p;


# direct methods
.method constructor <init>(Lcom/kik/l/p;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/kik/l/r;->a:Lcom/kik/l/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 107
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 108
    iget-object v0, p0, Lcom/kik/l/r;->a:Lcom/kik/l/p;

    invoke-static {v0}, Lcom/kik/l/p;->b(Lcom/kik/l/p;)Lcom/android/volley/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/volley/p;->a()V

    .line 109
    iget-object v0, p0, Lcom/kik/l/r;->a:Lcom/kik/l/p;

    invoke-static {v0}, Lcom/kik/l/p;->c(Lcom/kik/l/p;)Lcom/kik/cache/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cache/ap;->a()V

    .line 110
    return-void
.end method
