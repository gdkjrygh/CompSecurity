.class final Lkik/android/chat/fragment/no;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikPickUsersFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPickUsersFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lkik/android/chat/fragment/no;->b:Lkik/android/chat/fragment/KikPickUsersFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/no;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 186
    check-cast p1, Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/chat/fragment/no;->b:Lkik/android/chat/fragment/KikPickUsersFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/no;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lkik/android/chat/fragment/KikPickUsersFragment;->a(Ljava/lang/String;Lkik/a/d/k;)V

    return-void
.end method
