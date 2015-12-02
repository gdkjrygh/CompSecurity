.class synthetic Lcom/facebook/orca/prefs/x;
.super Ljava/lang/Object;
.source "OrcaContactsPreferenceActivity.java"


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 235
    invoke-static {}, Lcom/facebook/contacts/upload/k;->values()[Lcom/facebook/contacts/upload/k;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/orca/prefs/x;->b:[I

    :try_start_0
    sget-object v0, Lcom/facebook/orca/prefs/x;->b:[I

    sget-object v1, Lcom/facebook/contacts/upload/k;->NOT_STARTED:Lcom/facebook/contacts/upload/k;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_8

    :goto_0
    :try_start_1
    sget-object v0, Lcom/facebook/orca/prefs/x;->b:[I

    sget-object v1, Lcom/facebook/contacts/upload/k;->STARTED:Lcom/facebook/contacts/upload/k;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_7

    :goto_1
    :try_start_2
    sget-object v0, Lcom/facebook/orca/prefs/x;->b:[I

    sget-object v1, Lcom/facebook/contacts/upload/k;->RUNNING:Lcom/facebook/contacts/upload/k;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_6

    :goto_2
    :try_start_3
    sget-object v0, Lcom/facebook/orca/prefs/x;->b:[I

    sget-object v1, Lcom/facebook/contacts/upload/k;->SUCCEEDED:Lcom/facebook/contacts/upload/k;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_5

    :goto_3
    :try_start_4
    sget-object v0, Lcom/facebook/orca/prefs/x;->b:[I

    sget-object v1, Lcom/facebook/contacts/upload/k;->FAILED:Lcom/facebook/contacts/upload/k;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 144
    :goto_4
    invoke-static {}, Lcom/facebook/orca/prefs/y;->values()[Lcom/facebook/orca/prefs/y;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/orca/prefs/x;->a:[I

    :try_start_5
    sget-object v0, Lcom/facebook/orca/prefs/x;->a:[I

    sget-object v1, Lcom/facebook/orca/prefs/y;->NOT_STARTED:Lcom/facebook/orca/prefs/y;

    invoke-virtual {v1}, Lcom/facebook/orca/prefs/y;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_3

    :goto_5
    :try_start_6
    sget-object v0, Lcom/facebook/orca/prefs/x;->a:[I

    sget-object v1, Lcom/facebook/orca/prefs/y;->IN_PROGRESS:Lcom/facebook/orca/prefs/y;

    invoke-virtual {v1}, Lcom/facebook/orca/prefs/y;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_2

    :goto_6
    :try_start_7
    sget-object v0, Lcom/facebook/orca/prefs/x;->a:[I

    sget-object v1, Lcom/facebook/orca/prefs/y;->FINISHED_SUCCESS:Lcom/facebook/orca/prefs/y;

    invoke-virtual {v1}, Lcom/facebook/orca/prefs/y;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_1

    :goto_7
    :try_start_8
    sget-object v0, Lcom/facebook/orca/prefs/x;->a:[I

    sget-object v1, Lcom/facebook/orca/prefs/y;->FINISHED_ERROR:Lcom/facebook/orca/prefs/y;

    invoke-virtual {v1}, Lcom/facebook/orca/prefs/y;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_0

    :goto_8
    return-void

    :catch_0
    move-exception v0

    goto :goto_8

    :catch_1
    move-exception v0

    goto :goto_7

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_5

    .line 235
    :catch_4
    move-exception v0

    goto :goto_4

    :catch_5
    move-exception v0

    goto :goto_3

    :catch_6
    move-exception v0

    goto :goto_2

    :catch_7
    move-exception v0

    goto :goto_1

    :catch_8
    move-exception v0

    goto :goto_0
.end method
