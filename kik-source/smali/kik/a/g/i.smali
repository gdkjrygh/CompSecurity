.class final Lkik/a/g/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 607
    iput-object p1, p0, Lkik/a/g/i;->b:Lkik/a/g/b;

    iput-object p2, p0, Lkik/a/g/i;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 607
    iget-object v0, p0, Lkik/a/g/i;->b:Lkik/a/g/b;

    iget-object v1, p0, Lkik/a/g/i;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lkik/a/g/b;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    return-object v0
.end method
