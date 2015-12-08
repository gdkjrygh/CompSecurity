.class final Lkik/a/g/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/r$a;


# instance fields
.field final synthetic a:Lkik/a/f/f/a;

.field final synthetic b:Lkik/a/g/x;


# direct methods
.method constructor <init>(Lkik/a/g/x;Lkik/a/f/f/a;)V
    .locals 0

    .prologue
    .line 1122
    iput-object p1, p0, Lkik/a/g/y;->b:Lkik/a/g/x;

    iput-object p2, p0, Lkik/a/g/y;->a:Lkik/a/f/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 1126
    iget-object v0, p0, Lkik/a/g/y;->a:Lkik/a/f/f/a;

    invoke-virtual {v0}, Lkik/a/f/f/a;->a()Lkik/a/d/k;

    move-result-object v0

    .line 1129
    invoke-virtual {v0, p1}, Lkik/a/d/k;->b(Lkik/a/d/k;)V

    .line 1130
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/a/d/k;->d(Z)V

    .line 1132
    invoke-virtual {p1}, Lkik/a/d/k;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Lkik/a/d/k;->a(Z)V

    .line 1134
    invoke-virtual {p1, v0}, Lkik/a/d/k;->c(Lkik/a/d/k;)V

    .line 1135
    return-void
.end method
