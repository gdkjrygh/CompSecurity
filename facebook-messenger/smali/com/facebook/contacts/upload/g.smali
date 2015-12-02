.class synthetic Lcom/facebook/contacts/upload/g;
.super Ljava/lang/Object;
.source "ContactsUploadServiceHandler.java"


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I

.field static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 505
    invoke-static {}, Lcom/facebook/contacts/server/af;->values()[Lcom/facebook/contacts/server/af;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/contacts/upload/g;->c:[I

    :try_start_0
    sget-object v0, Lcom/facebook/contacts/upload/g;->c:[I

    sget-object v1, Lcom/facebook/contacts/server/af;->HIGH:Lcom/facebook/contacts/server/af;

    invoke-virtual {v1}, Lcom/facebook/contacts/server/af;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_7

    :goto_0
    :try_start_1
    sget-object v0, Lcom/facebook/contacts/upload/g;->c:[I

    sget-object v1, Lcom/facebook/contacts/server/af;->MEDIUM:Lcom/facebook/contacts/server/af;

    invoke-virtual {v1}, Lcom/facebook/contacts/server/af;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_6

    .line 489
    :goto_1
    invoke-static {}, Lcom/facebook/contacts/upload/h;->values()[Lcom/facebook/contacts/upload/h;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/contacts/upload/g;->b:[I

    :try_start_2
    sget-object v0, Lcom/facebook/contacts/upload/g;->b:[I

    sget-object v1, Lcom/facebook/contacts/upload/h;->LOCAL_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/h;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_5

    :goto_2
    :try_start_3
    sget-object v0, Lcom/facebook/contacts/upload/g;->b:[I

    sget-object v1, Lcom/facebook/contacts/upload/h;->REMOTE_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/h;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_4

    .line 436
    :goto_3
    invoke-static {}, Lcom/facebook/contacts/server/ag;->values()[Lcom/facebook/contacts/server/ag;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/contacts/upload/g;->a:[I

    :try_start_4
    sget-object v0, Lcom/facebook/contacts/upload/g;->a:[I

    sget-object v1, Lcom/facebook/contacts/server/ag;->ADD:Lcom/facebook/contacts/server/ag;

    invoke-virtual {v1}, Lcom/facebook/contacts/server/ag;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_3

    :goto_4
    :try_start_5
    sget-object v0, Lcom/facebook/contacts/upload/g;->a:[I

    sget-object v1, Lcom/facebook/contacts/server/ag;->NONE:Lcom/facebook/contacts/server/ag;

    invoke-virtual {v1}, Lcom/facebook/contacts/server/ag;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_2

    :goto_5
    :try_start_6
    sget-object v0, Lcom/facebook/contacts/upload/g;->a:[I

    sget-object v1, Lcom/facebook/contacts/server/ag;->MODIFY:Lcom/facebook/contacts/server/ag;

    invoke-virtual {v1}, Lcom/facebook/contacts/server/ag;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_1

    :goto_6
    :try_start_7
    sget-object v0, Lcom/facebook/contacts/upload/g;->a:[I

    sget-object v1, Lcom/facebook/contacts/server/ag;->REMOVE:Lcom/facebook/contacts/server/ag;

    invoke-virtual {v1}, Lcom/facebook/contacts/server/ag;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_0

    :goto_7
    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_4

    .line 489
    :catch_4
    move-exception v0

    goto :goto_3

    :catch_5
    move-exception v0

    goto :goto_2

    .line 505
    :catch_6
    move-exception v0

    goto :goto_1

    :catch_7
    move-exception v0

    goto :goto_0
.end method
