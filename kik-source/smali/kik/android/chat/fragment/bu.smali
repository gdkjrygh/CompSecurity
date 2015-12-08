.class final Lkik/android/chat/fragment/bu;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 124
    iget-object v1, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)Lkik/a/d/n;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/n;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v4, "\\s+"

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    move v1, v0

    :goto_0
    if-ge v1, v5, :cond_1

    aget-object v6, v4, v1

    invoke-static {v6}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a:Lcom/kik/android/a;

    const-string v4, "Group Name Changed"

    invoke-virtual {v1, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v4, "Is Empty"

    invoke-static {v2}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v4, "Was Empty"

    invoke-static {v3}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v1, v4, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v3, "Length"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v1, v3, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Word Count"

    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->J()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 149
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 150
    check-cast p1, Lkik/a/f/q;

    .line 151
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0xfa0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    .line 152
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    const v1, 0x7f090122

    invoke-static {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->Q:Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a:Lcom/kik/android/a;

    const-string v1, "Group Name Change Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Invalid Name"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 157
    :cond_1
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0xfa1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    .line 158
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    const v1, 0x7f09017c

    invoke-static {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->Q:Ljava/lang/String;

    goto :goto_0

    .line 160
    :cond_2
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0x193

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    if-eqz v0, :cond_3

    .line 161
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    const v1, 0x7f0902c8

    invoke-static {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->P:Ljava/lang/String;

    .line 162
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    const v1, 0x7f090121

    invoke-static {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->Q:Ljava/lang/String;

    .line 163
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a:Lcom/kik/android/a;

    const-string v1, "Group Name Change Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Invalid Name"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    .line 167
    :cond_3
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0x195

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    if-eqz v0, :cond_4

    .line 168
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090181

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->Q:Ljava/lang/String;

    goto :goto_0

    .line 170
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    const v1, 0x7f090383

    invoke-static {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->Q:Ljava/lang/String;

    .line 172
    iget-object v0, p0, Lkik/android/chat/fragment/bu;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a:Lcom/kik/android/a;

    const-string v1, "Group Name Change Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Network"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_0
.end method
