.class final Lcom/kik/g/g;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/i;

.field final synthetic b:Lcom/kik/g/as;

.field final synthetic c:Lcom/kik/g/f;


# direct methods
.method constructor <init>(Lcom/kik/g/f;Lcom/kik/g/i;Lcom/kik/g/as;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/kik/g/g;->c:Lcom/kik/g/f;

    iput-object p2, p0, Lcom/kik/g/g;->a:Lcom/kik/g/i;

    iput-object p3, p0, Lcom/kik/g/g;->b:Lcom/kik/g/as;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 93
    iget-object v0, p0, Lcom/kik/g/g;->a:Lcom/kik/g/i;

    iget-object v1, p0, Lcom/kik/g/g;->b:Lcom/kik/g/as;

    invoke-interface {v1, p2}, Lcom/kik/g/as;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/kik/g/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    return-void
.end method
