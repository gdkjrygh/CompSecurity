.class final Lkik/a/g/ay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/r$a;


# instance fields
.field final synthetic a:Lkik/a/g/aw;


# direct methods
.method constructor <init>(Lkik/a/g/aw;)V
    .locals 0

    .prologue
    .line 1085
    iput-object p1, p0, Lkik/a/g/ay;->a:Lkik/a/g/aw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 1089
    invoke-virtual {p1}, Lkik/a/d/k;->q()Z

    move-result v0

    invoke-virtual {p1}, Lkik/a/d/k;->o()Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 1095
    invoke-virtual {p1}, Lkik/a/d/k;->o()Z

    move-result v0

    invoke-virtual {p1, v0}, Lkik/a/d/k;->g(Z)V

    .line 1103
    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/a/d/k;->a(I)V

    .line 1104
    return-void

    .line 1097
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/k;->p()Z

    move-result v0

    invoke-virtual {p1}, Lkik/a/d/k;->n()Z

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1099
    invoke-virtual {p1}, Lkik/a/d/k;->n()Z

    move-result v0

    invoke-virtual {p1, v0}, Lkik/a/d/k;->f(Z)V

    goto :goto_0
.end method
