.class final Lcom/kik/l/h;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/l/f;


# direct methods
.method constructor <init>(Lcom/kik/l/f;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/kik/l/h;->a:Lcom/kik/l/f;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 117
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 118
    iget-object v0, p0, Lcom/kik/l/h;->a:Lcom/kik/l/f;

    invoke-static {v0}, Lcom/kik/l/f;->b(Lcom/kik/l/f;)Lcom/android/volley/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/volley/p;->a()V

    .line 119
    iget-object v0, p0, Lcom/kik/l/h;->a:Lcom/kik/l/f;

    invoke-static {v0}, Lcom/kik/l/f;->c(Lcom/kik/l/f;)Lcom/kik/cache/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cache/ap;->a()V

    .line 120
    return-void
.end method
