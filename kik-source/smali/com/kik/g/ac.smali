.class final Lcom/kik/g/ac;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/f;

.field final synthetic b:Lcom/kik/g/e;

.field final synthetic c:Lcom/kik/g/i;


# direct methods
.method constructor <init>(Lcom/kik/g/f;Lcom/kik/g/e;Lcom/kik/g/i;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/kik/g/ac;->a:Lcom/kik/g/f;

    iput-object p2, p0, Lcom/kik/g/ac;->b:Lcom/kik/g/e;

    iput-object p3, p0, Lcom/kik/g/ac;->c:Lcom/kik/g/i;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 57
    iget-object v0, p0, Lcom/kik/g/ac;->a:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/g/ac;->b:Lcom/kik/g/e;

    iget-object v2, p0, Lcom/kik/g/ac;->c:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->b(Lcom/kik/g/e;Lcom/kik/g/i;)V

    .line 58
    return-void
.end method
