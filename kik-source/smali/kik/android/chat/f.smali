.class final Lkik/android/chat/f;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 541
    iput-object p1, p0, Lkik/android/chat/f;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 541
    iget-object v0, p0, Lkik/android/chat/f;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->i(Lkik/android/chat/KikApplication;)Lkik/a/e/v;

    move-result-object v0

    const-string v1, "kik.profile.outofdate"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    return-void
.end method
