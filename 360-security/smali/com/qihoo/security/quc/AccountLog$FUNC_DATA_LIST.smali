.class public final enum Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/quc/AccountLog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FUNC_DATA_LIST"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DATA_APP_MGR_UNINSTALL_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_BACKUP_APP_SUCCESS_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_BLOCKED_SMS_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_BLOCK_BLACKLIST_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_BLOCK_TELEPHONE_NUMBER_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_CHECKUP_CALENDAR:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_CLEANUP:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_CLEAN_TOTAL_SIZE:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_FIND_MALWARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_FLOAT_VIEW_CLEANUP:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_FLOAT_VIEW_SWITCHER:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_FLOAT_WINDOW_USEED_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_KILL_MALWARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_NOTIFICATION_TOOLS:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_SHAKE_HIGHEST_SCORE:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field public static final enum DATA_SHARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

.field private static final synthetic a:[Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;


# instance fields
.field public final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 282
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_CLEANUP"

    const/16 v2, 0x1f41

    invoke-direct {v0, v1, v4, v2}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_CLEANUP:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 285
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_FIND_MALWARE_COUNT"

    const/16 v2, 0x1f42

    invoke-direct {v0, v1, v5, v2}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FIND_MALWARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 288
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_KILL_MALWARE_COUNT"

    const/16 v2, 0x1f43

    invoke-direct {v0, v1, v6, v2}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_KILL_MALWARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 291
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_BLOCK_TELEPHONE_NUMBER_COUNT"

    const/16 v2, 0x1f44

    invoke-direct {v0, v1, v7, v2}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BLOCK_TELEPHONE_NUMBER_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 294
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_FLOAT_VIEW_CLEANUP"

    const/16 v2, 0x1f45

    invoke-direct {v0, v1, v8, v2}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FLOAT_VIEW_CLEANUP:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 297
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_FLOAT_VIEW_SWITCHER"

    const/4 v2, 0x5

    const/16 v3, 0x1f46

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FLOAT_VIEW_SWITCHER:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 300
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_NOTIFICATION_TOOLS"

    const/4 v2, 0x6

    const/16 v3, 0x1f47

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_NOTIFICATION_TOOLS:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 303
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_BLOCK_BLACKLIST_COUNT"

    const/4 v2, 0x7

    const/16 v3, 0x1f48

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BLOCK_BLACKLIST_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 306
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_BLOCKED_SMS_COUNT"

    const/16 v2, 0x8

    const/16 v3, 0x1f49

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BLOCKED_SMS_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 309
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_SHAKE_HIGHEST_SCORE"

    const/16 v2, 0x9

    const/16 v3, 0x1f4a

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_SHAKE_HIGHEST_SCORE:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 312
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_CLEAN_TOTAL_SIZE"

    const/16 v2, 0xa

    const/16 v3, 0x1f4b

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_CLEAN_TOTAL_SIZE:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 315
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_BACKUP_APP_SUCCESS_NUM"

    const/16 v2, 0xb

    const/16 v3, 0x1f4c

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BACKUP_APP_SUCCESS_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 318
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_APP_MGR_UNINSTALL_NUM"

    const/16 v2, 0xc

    const/16 v3, 0x1f4d

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_APP_MGR_UNINSTALL_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 322
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_CHECKUP_CALENDAR"

    const/16 v2, 0xd

    const/16 v3, 0x1f4e

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_CHECKUP_CALENDAR:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 325
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_SHARE_COUNT"

    const/16 v2, 0xe

    const/16 v3, 0x1f4f

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_SHARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 328
    new-instance v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    const-string/jumbo v1, "DATA_FLOAT_WINDOW_USEED_NUM"

    const/16 v2, 0xf

    const/16 v3, 0x1f50

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FLOAT_WINDOW_USEED_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    .line 278
    const/16 v0, 0x10

    new-array v0, v0, [Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    sget-object v1, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_CLEANUP:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FIND_MALWARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_KILL_MALWARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BLOCK_TELEPHONE_NUMBER_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v1, v0, v7

    sget-object v1, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FLOAT_VIEW_CLEANUP:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FLOAT_VIEW_SWITCHER:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_NOTIFICATION_TOOLS:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BLOCK_BLACKLIST_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BLOCKED_SMS_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_SHAKE_HIGHEST_SCORE:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_CLEAN_TOTAL_SIZE:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_BACKUP_APP_SUCCESS_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_APP_MGR_UNINSTALL_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_CHECKUP_CALENDAR:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_SHARE_COUNT:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->DATA_FLOAT_WINDOW_USEED_NUM:Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->a:[Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 335
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 336
    iput p3, p0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->value:I

    .line 337
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;
    .locals 1

    .prologue
    .line 278
    const-class v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;
    .locals 1

    .prologue
    .line 278
    sget-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->a:[Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    invoke-virtual {v0}, [Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/quc/AccountLog$FUNC_DATA_LIST;

    return-object v0
.end method
