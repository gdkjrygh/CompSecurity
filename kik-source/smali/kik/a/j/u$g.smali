.class final Lkik/a/j/u$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/j/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lkik/a/j/u$g;->a:Ljava/lang/Class;

    .line 60
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 52
    check-cast p1, Lkik/a/d/ab;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/a/j/u$g;->a:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Lkik/a/d/ab;->a(Ljava/lang/Class;)Lcom/b/a/n;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
