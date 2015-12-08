.class final Lkik/a/b/a/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/h/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/b/a/a;

.field private final b:Lkik/a/d/f;


# direct methods
.method public constructor <init>(Lkik/a/b/a/a;Lkik/a/d/f;)V
    .locals 0

    .prologue
    .line 2592
    iput-object p1, p0, Lkik/a/b/a/a$b;->a:Lkik/a/b/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2593
    iput-object p2, p0, Lkik/a/b/a/a$b;->b:Lkik/a/d/f;

    .line 2594
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 2599
    iget-object v0, p0, Lkik/a/b/a/a$b;->a:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->l(Lkik/a/b/a/a;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lkik/a/b/a/a$b;->b:Lkik/a/d/f;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 2600
    return-void
.end method
