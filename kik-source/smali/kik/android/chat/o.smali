.class final Lkik/android/chat/o;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 913
    iput-object p1, p0, Lkik/android/chat/o;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 917
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    .line 918
    iget-object v0, p0, Lkik/android/chat/o;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->v(Lkik/android/chat/KikApplication;)Lkik/android/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/b/a;->a()V

    .line 919
    return-void
.end method
