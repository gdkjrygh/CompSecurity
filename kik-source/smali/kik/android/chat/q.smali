.class final Lkik/android/chat/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/p;


# direct methods
.method constructor <init>(Lkik/android/chat/p;)V
    .locals 0

    .prologue
    .line 983
    iput-object p1, p0, Lkik/android/chat/q;->a:Lkik/android/chat/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/high16 v6, 0x447a0000    # 1000.0f

    .line 987
    iget-object v0, p0, Lkik/android/chat/q;->a:Lkik/android/chat/p;

    iget-object v0, v0, Lkik/android/chat/p;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Session Started"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;)Lcom/kik/android/a;

    .line 989
    iget-object v0, p0, Lkik/android/chat/q;->a:Lkik/android/chat/p;

    iget-object v0, v0, Lkik/android/chat/p;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Opened"

    const-string v2, "App Session Started"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    .line 991
    iget-object v2, p0, Lkik/android/chat/q;->a:Lkik/android/chat/p;

    iget-object v2, v2, Lkik/android/chat/p;->a:Lkik/android/chat/KikApplication;

    iget-object v2, v2, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "50% Launch Time"

    long-to-float v4, v0

    div-float/2addr v4, v6

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;FF)Lcom/kik/android/a;

    .line 992
    iget-object v2, p0, Lkik/android/chat/q;->a:Lkik/android/chat/p;

    iget-object v2, v2, Lkik/android/chat/p;->a:Lkik/android/chat/KikApplication;

    iget-object v2, v2, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "95% Launch Time"

    long-to-float v0, v0

    div-float/2addr v0, v6

    const v1, 0x3f733333    # 0.95f

    invoke-virtual {v2, v3, v0, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;FF)Lcom/kik/android/a;

    .line 993
    return-void
.end method
