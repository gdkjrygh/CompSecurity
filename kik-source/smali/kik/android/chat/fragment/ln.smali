.class final Lkik/android/chat/fragment/ln;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikGroupMembersListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V
    .locals 0

    .prologue
    .line 174
    iput-object p1, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->w()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const v4, 0x7f0902ba

    .line 184
    iget-object v0, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->w()V

    .line 186
    const/16 v0, 0x64

    .line 189
    instance-of v2, p1, Lkik/a/f/q;

    if-eqz v2, :cond_3

    .line 190
    check-cast p1, Lkik/a/f/q;

    .line 192
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v2

    .line 193
    invoke-virtual {p1}, Lkik/a/f/q;->b()Ljava/lang/Object;

    move-result-object v0

    .line 196
    :goto_0
    sparse-switch v2, :sswitch_data_0

    .line 227
    iget-object v0, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d(I)V

    .line 230
    :goto_1
    return-void

    .line 198
    :sswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090025

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 201
    :sswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09011a

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 204
    :sswitch_2
    check-cast v0, Ljava/lang/String;

    .line 205
    if-nez v0, :cond_0

    .line 206
    const v0, 0x7f090202

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v0

    .line 208
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0901a2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 211
    :sswitch_3
    iget-object v1, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 214
    :sswitch_4
    iget-object v3, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/n;->J()Ljava/lang/String;

    move-result-object v1

    .line 216
    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 217
    check-cast v0, Ljava/util/List;

    .line 218
    iget-object v1, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-static {v0, v1}, Lkik/android/util/cq;->a(Ljava/util/List;Lkik/a/e/r;)Ljava/lang/String;

    .line 220
    iget-object v0, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090119

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 223
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ln;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d(I)V

    goto/16 :goto_1

    :cond_3
    move v2, v0

    move-object v0, v1

    goto/16 :goto_0

    .line 196
    nop

    :sswitch_data_0
    .sparse-switch
        0x68 -> :sswitch_3
        0xc9 -> :sswitch_2
        0xca -> :sswitch_0
        0xcb -> :sswitch_1
        0xfa2 -> :sswitch_4
    .end sparse-switch
.end method
