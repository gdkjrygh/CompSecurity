.class final Lkik/a/j/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/a/j/u;


# direct methods
.method constructor <init>(Lkik/a/j/u;)V
    .locals 0

    .prologue
    .line 617
    iput-object p1, p0, Lkik/a/j/aa;->a:Lkik/a/j/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 617
    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    return-object v0
.end method
