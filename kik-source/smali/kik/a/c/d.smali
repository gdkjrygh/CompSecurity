.class final Lkik/a/c/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/c/c;


# direct methods
.method constructor <init>(Lkik/a/c/c;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lkik/a/c/d;->a:Lkik/a/c/c;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lkik/a/c/d;->a:Lkik/a/c/c;

    invoke-static {v0}, Lkik/a/c/c;->a(Lkik/a/c/c;)Lkik/a/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/c/f;->b()V

    .line 55
    return-void
.end method
