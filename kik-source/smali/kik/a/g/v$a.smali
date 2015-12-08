.class final Lkik/a/g/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/g/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/g/v;

.field private b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lkik/a/g/v;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lkik/a/g/v$a;->a:Lkik/a/g/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p2, p0, Lkik/a/g/v$a;->b:Ljava/lang/String;

    .line 82
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 74
    iget-object v0, p0, Lkik/a/g/v$a;->a:Lkik/a/g/v;

    iget-object v1, p0, Lkik/a/g/v$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/a/g/v;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    return-object v0
.end method
