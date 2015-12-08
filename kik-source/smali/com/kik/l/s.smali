.class final Lcom/kik/l/s;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/l/p;


# direct methods
.method constructor <init>(Lcom/kik/l/p;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/kik/l/s;->a:Lcom/kik/l/p;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 119
    check-cast p2, Lcom/kik/cache/z;

    iget-object v0, p0, Lcom/kik/l/s;->a:Lcom/kik/l/p;

    invoke-static {v0, p2}, Lcom/kik/l/p;->a(Lcom/kik/l/p;Lcom/kik/cache/z;)V

    return-void
.end method
