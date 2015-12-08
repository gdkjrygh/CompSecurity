.class final Lcom/kik/l/i;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/l/f;


# direct methods
.method constructor <init>(Lcom/kik/l/f;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/kik/l/i;->a:Lcom/kik/l/f;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 129
    check-cast p2, Lcom/kik/cache/z;

    iget-object v0, p0, Lcom/kik/l/i;->a:Lcom/kik/l/f;

    invoke-static {v0, p2}, Lcom/kik/l/f;->a(Lcom/kik/l/f;Lcom/kik/cache/z;)V

    return-void
.end method
