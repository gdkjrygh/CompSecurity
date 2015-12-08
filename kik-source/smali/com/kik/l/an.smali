.class final Lcom/kik/l/an;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/l/am;


# direct methods
.method constructor <init>(Lcom/kik/l/am;)V
    .locals 0

    .prologue
    .line 244
    iput-object p1, p0, Lcom/kik/l/an;->a:Lcom/kik/l/am;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 244
    check-cast p2, Lkik/a/d/k;

    iget-object v0, p0, Lcom/kik/l/an;->a:Lcom/kik/l/am;

    invoke-virtual {v0, p2}, Lcom/kik/l/am;->a(Lkik/a/d/k;)V

    return-void
.end method
