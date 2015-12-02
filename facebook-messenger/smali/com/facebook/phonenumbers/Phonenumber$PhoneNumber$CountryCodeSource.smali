.class public final enum Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_DEFAULT_COUNTRY:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_NUMBER_WITHOUT_PLUS_SIGN:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_NUMBER_WITH_IDD:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_NUMBER_WITH_PLUS_SIGN:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_NUMBER_WITH_PLUS_SIGN"

    invoke-direct {v0, v1, v2}, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_PLUS_SIGN:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    new-instance v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_NUMBER_WITH_IDD"

    invoke-direct {v0, v1, v3}, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_IDD:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    new-instance v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_NUMBER_WITHOUT_PLUS_SIGN"

    invoke-direct {v0, v1, v4}, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITHOUT_PLUS_SIGN:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    new-instance v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_DEFAULT_COUNTRY"

    invoke-direct {v0, v1, v5}, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_DEFAULT_COUNTRY:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    sget-object v1, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_PLUS_SIGN:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_IDD:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITHOUT_PLUS_SIGN:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_DEFAULT_COUNTRY:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->$VALUES:[Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;
    .locals 1

    const-class v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    return-object v0
.end method

.method public static values()[Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;
    .locals 1

    sget-object v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->$VALUES:[Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    invoke-virtual {v0}, [Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;

    return-object v0
.end method
