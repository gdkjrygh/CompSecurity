.class final Lkik/a/f/f/aa;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/f/f/z;


# direct methods
.method constructor <init>(Lkik/a/f/f/z;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lkik/a/f/f/aa;->a:Lkik/a/f/f/z;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 200
    iget-object v0, p0, Lkik/a/f/f/aa;->a:Lkik/a/f/f/z;

    iget-object v0, v0, Lkik/a/f/f/z;->h:Lkik/a/f/j;

    check-cast p1, Lkik/a/f/f/z;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lkik/a/f/j;->a(Lkik/a/f/f/z;I)V

    .line 201
    return-void
.end method
