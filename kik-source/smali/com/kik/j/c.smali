.class public final Lcom/kik/j/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lkik/android/chat/b/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkik/android/chat/a/a;Lkik/a/e/v;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Lkik/android/chat/b/d;

    invoke-direct {v0, p1, p2, p3}, Lkik/android/chat/b/d;-><init>(Landroid/content/Context;Lkik/android/chat/a/a;Lkik/a/e/v;)V

    iput-object v0, p0, Lcom/kik/j/c;->a:Lkik/android/chat/b/d;

    .line 23
    return-void
.end method


# virtual methods
.method final a()Lkik/android/chat/b/d;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/kik/j/c;->a:Lkik/android/chat/b/d;

    return-object v0
.end method
